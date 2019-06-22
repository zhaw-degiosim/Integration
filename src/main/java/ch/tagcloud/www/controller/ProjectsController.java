package ch.tagcloud.www.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectsController {
	
	private static Logger logger = LogManager.getLogger(ProjectsController.class);
	
	@GetMapping(value = "/projects")
    public String indexPage(Model model) {
		
		logger.info("Serve template: activities");
 
        return "projects";
    }
	
}