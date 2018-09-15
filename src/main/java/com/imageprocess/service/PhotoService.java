package com.imageprocess.service;

import java.util.List;

import com.imageprocess.model.Photo;
import com.imageprocess.model.User;

public interface PhotoService {

	Photo save(Photo photo);

    List<Photo> findAll();

    List<Photo> findByUser(User user);

    Photo findByPhotoId(Long photoId);

}
