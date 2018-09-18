/**
 * 
 */
package com.imageprocess.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.imageprocess.dao.PhotoDao;
import com.imageprocess.model.Photo;

/**
 * @author vipul
 *
 */
@Repository
public class PhotoDaoImpl implements PhotoDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/**
	 * 
	 */
	public PhotoDaoImpl() {
		//default constructor
	}

	@Override
	public void save(Photo photo) {
		/*jdbcTemplate.update(""
				+ "INSERT INTO heroku_695cdbf80fe0ec1.`imageprocess.photo` (first_name, last_name, password,user_name) "
				+ "VALUES (?, ?, ?, ?)", user.getFirstName(), user.getLastName(), user.getPassword(),user.getUserName());*/
		
	}

	
}
