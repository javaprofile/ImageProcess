/**
 * 
 */
package com.imageprocess.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.imageprocess.model.Photo;
import com.imageprocess.model.User;

/**
 * @author vipul
 *
 */
@Repository
public class PhotoDao {


	@Autowired
	private JdbcTemplate jdbcTemplate;


}
