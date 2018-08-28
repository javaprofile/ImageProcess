/**
 * 
 */
package com.imageprocess.model;

/**
 * @author vipul
 *
 */
public class Comment {

	/**
	 * 
	 */
	public Comment() {
		// Default constructor
	}


    private Long commentId;
    private String content;

   // @ManyToOne
    private Photo photo;
    private Long photoId;
    private String userName;
	public Long getCommentId() {
		return commentId;
	}
	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Photo getPhoto() {
		return photo;
	}
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	public Long getPhotoId() {
		return photoId;
	}
	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

//    @CreationTimestamp
//    private Date created;
//
//    @UpdateTimestamp
//    private Date updated;

}
