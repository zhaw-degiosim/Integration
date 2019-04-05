package ch.tagcloud.www.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AboutController {
	
	private static Logger logger = LogManager.getLogger(AboutController.class);
	
	@GetMapping(value = "/about")
    public String loginPage(Model model) {                                  

		logger.info("Serve template: about");
		
        return "about";

    }

}