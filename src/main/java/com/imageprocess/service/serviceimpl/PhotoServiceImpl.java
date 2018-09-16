/**
 * 
 */
package com.imageprocess.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imageprocess.dao.PhotoDao;
import com.imageprocess.model.Photo;
import com.imageprocess.model.User;
import com.imageprocess.service.PhotoService;

/**
 * @author vipul
 *
 */
@Service
public class PhotoServiceImpl implements PhotoService {



    @Autowired
    private PhotoDao photoDao;

	@Override
	public Photo save(Photo photo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Photo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Photo> findByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Photo findByPhotoId(Long photoId) {
		// TODO Auto-generated method stub
		return null;
	}



}
