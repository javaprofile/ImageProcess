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
public class Photo {

	/**
	 * 
	 */
	public Photo() {
		//Default constructor
	}

	private Long photoId;
    private String photoName;
    private String title;
    private String description;
    private String imageName;

    private Date created;

  //  @ManyToOne
    private User user;

//    @ManyToMany(mappedBy = "likedPhotoList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JsonIgnore
//    private List<User> likedUserList;

    private int likes;

   // @OneToMany(mappedBy = "photo",  fetch = FetchType.EAGER)
    private List<Comment> commentList;

	public Long getPhotoId() {
		return photoId;
	}

	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

}
