/**
 * 
 */
package com.imageprocess.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.imageprocess.model.Comment;

/**
 * @author vipul
 *
 */
@Repository
public class CommentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

}
