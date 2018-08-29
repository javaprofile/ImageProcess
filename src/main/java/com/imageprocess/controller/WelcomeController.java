/**
 * 
 */
package com.imageprocess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imageprocess.model.User;
import com.imageprocess.service.UserService;

/**
 * @author vipul
 *
 */
@Controller
public class WelcomeController {

	@Autowired
    private UserService userService;
	
	/**
	 * 
	 */
	public WelcomeController() {
		// Default Constructor
	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }
	
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);


        return "redirect:/welcome";
    }
	
}
