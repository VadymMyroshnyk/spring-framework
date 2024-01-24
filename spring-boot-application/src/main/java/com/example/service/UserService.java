package com.example.service;

import com.example.model.User;

public interface UserService {

    void save(User user);

    User findById(Long id);
}
