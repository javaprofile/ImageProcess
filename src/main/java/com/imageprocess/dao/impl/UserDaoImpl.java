/**
 * 
 */
package com.imageprocess.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.imageprocess.dao.UserDao;
import com.imageprocess.model.User;

/**
 * @author vipul
 *
 */
@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	/**
	 * 
	 */
	public UserDaoImpl() {
		//default constructor
	}

	@Override
	public void add(User user) {
		jdbcTemplate.update(""
				+ "INSERT INTO heroku_695cdbf80fe0ec1.`imageprocess.user` (first_name, last_name, password,user_name) "
				+ "VALUES (?, ?, ?, ?)", user.getFirstName(), user.getLastName(), user.getPassword(),user.getUserName());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findByUsername( String userName ) {
		 User userObj = (User) jdbcTemplate.queryForObject("SELECT * FROM heroku_695cdbf80fe0ec1.`imageprocess.user where person_id = ? ",
		            new Object[] { userName }, new BeanPropertyRowMapper<User>(User.class));
		return userObj;
	}

}
