/**
 * 
 */
package com.imageprocess.model;

import java.util.Date;
import java.util.List;

/**
 * @author vipul
 *
 */
public class User {

	/**
	 * 
	 */
	public User() {
		//Default Constructor
	}

	private Long userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String passwordConfirm;

    private Date created;
//
//    @UpdateTimestamp
//    private Date updated;

   // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Photo> photoList;

   // @ManyToMany
    private List<Photo> likedPhotoList;

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public List<Photo> getPhotoList() {
		return photoList;
	}

	public void setPhotoList(List<Photo> photoList) {
		this.photoList = photoList;
	}

	public List<Photo> getLikedPhotoList() {
		return likedPhotoList;
	}

	public void setLikedPhotoList(List<Photo> likedPhotoList) {
		this.likedPhotoList = likedPhotoList;
	}



	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
