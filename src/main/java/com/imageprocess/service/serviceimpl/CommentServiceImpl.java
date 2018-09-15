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

    public Comment save(Comment comment) {
        return commentDao.save(comment);
    }

    public Comment findOne (Long commentId) {
        return commentDao.findOne(commentId);
    }

    public List<Comment> findByPhotoId (Long photoId) {
        return commentDao.findByPhotoId(photoId);
    }


}
