/**
 * 
 */
package com.imageprocess.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * @author vipul
 *
 */
public class LoginUser {

	@NotEmpty
	private String userName;
	@NotEmpty
	private String password;
	/**
	 * 
	 */
	public LoginUser() {
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
