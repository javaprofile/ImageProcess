/**
 * 
 */
package com.imageprocess.service.serviceimpl;

import com.imageprocess.dao.UserDao;
import com.imageprocess.model.User;
import com.imageprocess.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao userDao;

	@Override
	public void save(User user) {
		userDao.add( user );
		
	}

	@Override
	public User findByUsername(String username) {
		
		return null;
	}


   

}
