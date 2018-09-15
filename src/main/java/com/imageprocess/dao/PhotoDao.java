/**
 * 
 */
package com.imageprocess.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imageprocess.model.Photo;
import com.imageprocess.model.User;

/**
 * @author vipul
 *
 */
@Repository
public interface PhotoDao extends CrudRepository<Photo, Long> {


    Photo save(Photo photo);

    List<Photo> findByUser(User user);

    List<Photo> findAll();

    Photo findByPhotoId(Long photoId);


}
