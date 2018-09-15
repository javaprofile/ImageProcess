/**
 * 
 */
package com.imageprocess.service;

import java.util.List;

import com.imageprocess.model.Comment;

/**
 * @author vipul
 *
 */
public interface CommentService {

	Comment save(Comment comment);

    List<Comment> findByPhotoId (Long photoId);

    Comment findOne(Long commentId);

}
