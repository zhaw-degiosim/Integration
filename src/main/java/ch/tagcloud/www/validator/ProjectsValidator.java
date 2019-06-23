package ch.tagcloud.www.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ch.tagcloud.www.model.Projects;

import ch.tagcloud.www.service.ProjectsService;

public class ProjectsValidator implements Validator {

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

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "validate.notempty");
		if (projects.getName().length() > 100) {

			logger.info("Projektname ist zu lang " + projects.getName());

			errors.rejectValue("name", "validation.projectForm.name.length");
		}

	}

}
