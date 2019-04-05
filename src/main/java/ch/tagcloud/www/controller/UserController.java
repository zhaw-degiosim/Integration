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

import ch.tagcloud.www.model.User;
import ch.tagcloud.www.service.SecurityService;
import ch.tagcloud.www.service.UserService;
import ch.tagcloud.www.validator.UserValidator;

@Controller
public class UserController {
	
	@Autowired
    private UserService userService;
	
	@Autowired
    private SecurityService securityService;
	
	@Autowired
    private UserValidator userValidator;
	
	private static Logger logger = LogManager.getLogger(UserController.class);
	
	@GetMapping(value = "/login")
    public String loginPage(Model model) {
		
		logger.info("Serve template: login");
 
        return "login";
    }
    
	@GetMapping(value = "/register")
    public String registerPage(Model model) {
    	
    	model.addAttribute("userForm", new User());
    	
    	logger.info("Serve template: register");
 
        return "register";
    }
    
    @PostMapping(value = "/register")
    public String registerAddPage(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
    	
    	logger.info("Validate register form for user: " + userForm.getMail());
    	
    	userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
        	
        	logger.info("Error in userForm. Return to register. User: " + userForm.getMail());
        	
            return "register";
        }
    	
        logger.info("Save User: " + userForm.getMail());
        
    	userService.save(userForm);
    	
    	securityService.autoLogin(userForm.getMail(), userForm.getPasswordConfirm());
    	
    	logger.info("Autologin succesfull. redirect:/index?register=true");
 
    	return "redirect:/index?register=true";
    }

}