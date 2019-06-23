package ch.tagcloud.www.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.tagcloud.www.model.Activities;

import ch.tagcloud.www.repository.ActivitiesRepository;

import java.util.List;

@Service
public class ActivitiesServiceImpl implements ActivitiesService {
	
    @Autowired
    private ActivitiesRepository activitiesRepository;
   
    
    private static Logger logger = LogManager.getLogger(ActivitiesServiceImpl.class);
    
   
    @Override
    public List<Activities> findAll() {
    	
    	logger.info("Find all projects");
    	
    	return activitiesRepository.findAll();
    }

}
