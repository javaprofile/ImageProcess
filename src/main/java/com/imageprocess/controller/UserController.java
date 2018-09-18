/**
 * 
 */
package com.imageprocess.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.imageprocess.model.User;

/**
 * @author vipul
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	/**
	 * 
	 */
	public UserController() {
		
	}

	@RequestMapping( value="/register", method= RequestMethod.POST)
	public User registerUser( @RequestBody User user ) {
		return null;
	}
	
	
}
