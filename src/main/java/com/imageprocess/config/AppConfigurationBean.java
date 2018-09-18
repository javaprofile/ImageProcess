/**
 * 
 */
package com.imageprocess.config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

/**
 * @author vipul
 *
 */
@Component
public class AppConfigurationBean implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

	/**
	 * 
	 */
	public AppConfigurationBean() {
		// Default constructor
	}

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		//factory.setContextPath("/imageprocess");
		
	}

}
