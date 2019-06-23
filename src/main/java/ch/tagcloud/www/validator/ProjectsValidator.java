package ch.tagcloud.www.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ch.tagcloud.www.model.Projects;

import ch.tagcloud.www.service.ProjectsService;




public class ProjectsValidator {
	
    @Autowired
    private ProjectsService projectService;
    
    private static Logger logger = LogManager.getLogger(ProjectsValidator.class);

    @Override
    public boolean supports(Class<?> aClass) {
        return Projects.class.equals(aClass);
    }

	@Override
    public void validate(Object o, Errors errors) {
		Projects projects = (Projects) o;
		
	}

}
