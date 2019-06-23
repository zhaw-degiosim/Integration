package ch.tagcloud.www.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ch.tagcloud.www.model.Activities;

public interface ActivitiesService {
	/*	
	@Transactional
    void save(Projects Projects);

    
    @Transactional
    void update(Projects projects);
    
*/
    
    @Transactional
    List<Activities> findAll();
}