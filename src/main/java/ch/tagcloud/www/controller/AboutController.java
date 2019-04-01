package ch.tagcloud.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
	
	@GetMapping(value = "/about")
    public String loginPage(Model model) {
 
        return "about";
    }

}