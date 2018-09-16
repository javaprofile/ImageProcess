/**
 * 
 */
package com.imageprocess.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.imageprocess.dao.CommentDao;
import com.imageprocess.model.Comment;
import com.imageprocess.service.CommentService;

/**
 * @author vipul
 *
 */
public class CommentServiceImpl implements CommentService {

	@Autowired
    private CommentDao commentDao;

	@Override
	public Comment save(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> findByPhotoId(Long photoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment findOne(Long commentId) {
		// TODO Auto-generated method stub
		return null;
	}



}
