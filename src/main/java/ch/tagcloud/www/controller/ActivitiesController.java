package ch.tagcloud.www.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ch.tagcloud.www.service.ActivitiesService;


@Controller
public class ActivitiesController {
	
	@Autowired
	private ActivitiesService activitiesService;
	
	private static Logger logger = LogManager.getLogger(ActivitiesController.class);
	
	@GetMapping(value = "/activities")
    public String indexPage(Model model) {
		
		
		logger.info("Find all activities");
		model.addAttribute("activities", activitiesService.findAll());
		
		
		logger.info("Serve template: activities");
 
        return "activities";
    }
	
}