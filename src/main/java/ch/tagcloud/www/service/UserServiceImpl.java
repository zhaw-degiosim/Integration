package ch.tagcloud.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ch.tagcloud.www.model.User;
import ch.tagcloud.www.repository.RoleRepository;
import ch.tagcloud.www.repository.UserRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    private static Logger logger = LogManager.getLogger(UserServiceImpl.class);

    @Override
    public void save(User user) {
    	
    	logger.info("Save user: " + user.getMail());
    	
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        // user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }
    
    @Override
    public void update(User user) {
    	
    	logger.info("update user: " + user.getMail());

        User userFromDb = userRepository.findByMail(user.getMail());

        userFromDb.setSalutation(user.getSalutation());
        userFromDb.setFirstName(user.getFirstName());
        userFromDb.setLastName(user.getLastName());
        userFromDb.setMail(user.getMail());
        userFromDb.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        
        userRepository.save(userFromDb);
    }

    @Override
    public User findByMail(String mail) {
    	
    	logger.info("Find user by mail: " + mail);
    	
        return userRepository.findByMail(mail);
    }
    
    @Override
    public List<User> findAll() {
    	
    	logger.info("Find all users");
    	
    	return userRepository.findAll();
    }
}