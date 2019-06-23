package ch.tagcloud.www.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ch.tagcloud.www.model.Projects;

public interface ProjectsService {
	
	@Transactional
    void save(Projects Projects);

/*    
    @Transactional
    void update(Projects projects);
    
*/
    
    @Transactional
    List<Projects> findAll();
}