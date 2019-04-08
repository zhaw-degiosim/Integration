package ch.tagcloud.www.service;

import ch.tagcloud.www.model.Role;
import ch.tagcloud.www.repository.RoleRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
    private RoleRepository roleRepository;
	
	private static Logger logger = LogManager.getLogger(RoleServiceImpl.class);
	
	@Override
    public List<Role> findAll() {
    	
    	logger.info("Find all roles");
    	
    	return roleRepository.findAll();
    }
	
}