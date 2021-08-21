package com.abel.blog.blogweb.service;

import java.util.Optional;

import com.abel.blog.blogweb.entities.User;

public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User save(User user);
}
