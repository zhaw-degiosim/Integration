package ch.tagcloud.www.controller;


import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ch.tagcloud.www.model.User;
import ch.tagcloud.www.repository.RoleRepository;
import ch.tagcloud.www.service.UserService;
import ch.tagcloud.www.validator.ProfileValidator;

@Controller
public class ProfilexController {
	
	@Autowired
    private UserService userService;
	
    @Autowired
    private RoleRepository roleRepository;
	
	@Autowired
    private ProfileValidator profileValidator;
	
	private static Logger logger = LogManager.getLogger(ProfilexController.class);

	@GetMapping(value = "/profile")
    public String profilePage(Model model, Principal principal) {	
		
		String username = principal.getName();
    	
    	model.addAttribute("userForm", userService.findByMail(username));
    	
    	logger.info("Serve template: profile");
 
        return "profile";
    }
	
	@PostMapping(value = "/profile")
    public String profileUpdate(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
    	
		logger.info("Validate update form for user: " + userForm.getMail());
		
    	profileValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
        	
        	logger.info("Error in userForm. Return to profile. User: " + userForm.getMail());
        	
            return "profile";
        }
    	
        logger.info("Update user: " + userForm.getMail());
        
    	userService.update(userForm);
    	
    	logger.info("redirect:/profile?update=true");
  
    	return "redirect:/profile?update=true";
    }
	
}