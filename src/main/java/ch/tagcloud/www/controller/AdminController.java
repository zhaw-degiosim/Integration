package ch.tagcloud.www.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ch.tagcloud.www.service.UserService;

@Controller
public class AdminController {
	
	@Autowired
	private UserService userService;
	
	private static Logger logger = LogManager.getLogger(AdminController.class);

	@GetMapping(value = "/admin")
    public String indexPage(Model model) {
		
		model.addAttribute("user", userService.findAll());
		
		logger.info("Serve template: admin");
 
        return "admin";
    }
	
}