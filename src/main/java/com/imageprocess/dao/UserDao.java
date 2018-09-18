package com.imageprocess.dao;



import com.imageprocess.model.User;

public interface UserDao {
	
	public void add( User user );
	public void update( User user );
	public void delete( User user );
	public User findByUsername( String userName );
}
