package ch.tagcloud.www.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ch.tagcloud.www.service.ProjectsService;

@Controller
public class ProjectsController {
	
	@Autowired
	private ProjectsService projectsService;
	
	private static Logger logger = LogManager.getLogger(ProjectsController.class);
	
	@GetMapping(value = "/projects")
    public String indexPage(Model model) {
		
		logger.info("Find all projects");
		model.addAttribute("projects", projectsService.findAll());
		
		logger.info("Serve template: projects");
 
        return "projects";
    }
	
}