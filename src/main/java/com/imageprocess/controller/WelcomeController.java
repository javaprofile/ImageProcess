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

	//@Autowired
    private UserService userService;
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("userForm") User userForm, 
    							BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);


        return "redirect:/home";
    }

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }
	
	
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homePage( @ModelAttribute("userHome") User userHome, 
							BindingResult bindingResult,
							Model model ) {
		if( bindingResult.hasErrors() ) {
			return "login";
		}
		return "home";
	}
}
