/**
 * 
 */
package com.imageprocess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.imageprocess.model.User;
import com.imageprocess.service.UserService;

/**
 * @author vipul
 *
 */
@Controller
@SessionAttributes("userForm")
public class WelcomeController {

	@Autowired
    private UserService userService;
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("userForm") User userForm, 
    							BindingResult bindingResult,
    							ModelMap model ) {

        /*if (bindingResult.hasErrors()) {
            return "registration";
        }
*/
        userService.save(userForm);
        User user = userService.findByUsername( userForm.getUserName() );
        
        return "home";
    }

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }
	
	
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homePage( Model model ) {
		model.addAttribute( "login",new User() );
		return "login";
	}
	
	@RequestMapping( value="/loginProcess",method=RequestMethod.POST)
	public String login( @ModelAttribute("login") User login,
						BindingResult validation,
						Model model ) {
		System.out.println("Controller Hit..!");
		if ( validation.hasErrors() ) {
			model.addAttribute("login",new User());
            return "login";
        }
		return "redirect:/home";
	}
}
