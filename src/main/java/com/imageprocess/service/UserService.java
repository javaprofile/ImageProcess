package com.imageprocess.service;

import com.imageprocess.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
