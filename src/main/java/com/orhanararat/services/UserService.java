package com.orhanararat.services;

import com.orhanararat.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

}
