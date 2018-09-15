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

    public Photo save(Photo photo) {
        return photoDao.save(photo);
    }

    public List<Photo> findAll() {
        return photoDao.findAll();
    }

    public List<Photo> findByUser(User user) {
        return photoDao.findByUser(user);
    }

    public Photo findByPhotoId(Long photoId) {
        return photoDao.findByPhotoId(photoId);
    }


}
