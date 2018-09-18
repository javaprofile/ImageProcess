/**
 * 
 */
package com.imageprocess.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vipul
 *
 */
@RestController
@RequestMapping("/test")
public class RestTestHelper {

	/**
	 * 
	 */
	public RestTestHelper() {
		//default constructor.
	}

	@RequestMapping( method = RequestMethod.GET)
	public String testImageProcess() {
		return "web service deployed and working.";
	}
}
