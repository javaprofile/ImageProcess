/**
 * 
 */
package com.imageprocess.config;

import javax.activation.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author vipul
 *
 */
//@Configuration
public class DatabaseConfig {

	/**
	 * 
	 */
	public DatabaseConfig() {
	}
	
	
	//@Bean
    //@Primary
    //@ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return (DataSource) DataSourceBuilder.create().build();
    }

}
