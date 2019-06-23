package ch.tagcloud.www.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.tagcloud.www.model.Projects;
import ch.tagcloud.www.model.User;
import ch.tagcloud.www.repository.ProjectsRepository;
import ch.tagcloud.www.validator.ProjectsValidator;

import java.util.HashSet;
import java.util.List;

@Service
public class ProjectsServiceImpl implements ProjectsService {
	
    @Autowired
    private ProjectsRepository projectsRepository;
   
    
    private static Logger logger = LogManager.getLogger(ProjectsServiceImpl.class);
    
    @Override
    public void save(Projects projects) {
    	
    	logger.info("Save Project: " + projects.getName());
    	
        projectsRepository.save(projects);
    }
    
    @Override
    public List<Projects> findAll() {
    	
    	logger.info("Find all projects");
    	
    	return projectsRepository.findAll();
    }

}
