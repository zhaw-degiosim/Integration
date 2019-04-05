package ch.tagcloud.www.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ch.tagcloud.www.service.UserService;

@Controller
public class MainController {
	
	@Autowired UserService userService;
	
	private static Logger logger = LogManager.getLogger(MainController.class);

	@GetMapping(value = { "/", "/index" })
    public String indexPage(Model model) {    
		
		logger.info("Serve template: index");
 
        return "index";
    }
	
}