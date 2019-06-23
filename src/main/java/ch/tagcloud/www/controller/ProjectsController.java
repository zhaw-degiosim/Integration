package ch.tagcloud.www.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ch.tagcloud.www.model.Projects;
import ch.tagcloud.www.model.User;
import ch.tagcloud.www.service.ProjectsService;
import ch.tagcloud.www.validator.ProjectsValidator;

@Controller
public class ProjectsController {
	
	@Autowired
	private ProjectsService projectsService;
/*	
    @Autowired
    private ProjectsValidator projectsValidator;
*/	
	private static Logger logger = LogManager.getLogger(ProjectsController.class);
	
	@GetMapping(value = "/projects")
    public String projects(Model model) {
		
		logger.info("Find all projects");
		model.addAttribute("projects", projectsService.findAll());
		
		logger.info("Serve template: projects");
 
        return "projects";
    }
	
	@GetMapping(value = "/projects_new")
    public String projectsNew(Model model) {
		
		logger.info("Create projectsForm for new project");
		model.addAttribute("projectsForm", new Projects());
		
		logger.info("Serve template: projects_new");
 
        return "projects_new";
    }
	
    @PostMapping(value = "/projects_new")
    public String registerAddPage(@ModelAttribute("projectsForm") Projects projectsForm, BindingResult bindingResult) {
    	
    	logger.info("Validate project form for: " + projectsForm.getName());
    	
/*    	projectsValidator.validate(projectsForm, bindingResult);

        if (bindingResult.hasErrors()) {
        	
        	logger.info("Error in projectsForm. Return to Projects. Project: " + projectsForm.getName());
        	
            return "projects_new";
        } */
    	
        logger.info("Save User: " + projectsForm.getName());
        
    	projectsService.save(projectsForm);
    	
    	logger.info("New Project created. redirect:/projects?projects_new=true");
 
    	return "redirect:/projects?projects_new=true";
    }
	
}