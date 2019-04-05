// To implement login/authentication with Spring Security, we need to implement org.springframework.security.core.userdetails.UserDetailsService interface

package ch.tagcloud.www.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.tagcloud.www.model.Role;
import ch.tagcloud.www.model.User;
import ch.tagcloud.www.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	
	private static Logger logger = LogManager.getLogger(UserDetailsServiceImpl.class);

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String mail) {
		User user = userRepository.findByMail(mail);
		if (user == null)
			throw new UsernameNotFoundException(mail);

		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		try {
		for (Role role : user.getRoles()) {
			
				logger.info("Grand authorities for user: " + user.getMail());
			
				grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
			}
		} catch (java.lang.NullPointerException exception) {
			
			logger.info("No roles found for user: " + user.getMail() + " Assigne role ROLE_DEFAULT");
			
			// Assign role ROLE_DEFAULT when no role is defined after registration
			grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_DEFAULT"));
		}

		return new org.springframework.security.core.userdetails.User(user.getMail(), user.getPassword(),
				grantedAuthorities);
	}
}