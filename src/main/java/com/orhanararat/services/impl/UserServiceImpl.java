package com.orhanararat.services.impl;

import com.orhanararat.model.User;
import com.orhanararat.repositories.UserRepository;
import com.orhanararat.services.UserService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @Override
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }

    //    @Override
//    public User getUserById(Long id) {
//        return userRepository.findById(id).get();
//    }

    @Override
    public User getUserById(Long id, int status) {
        return userRepository.getUserByIdAndStatus(id, status);
    }

    @Override
    public List<User> findAllByStatus() {
        return userRepository.findAllByStatus(1);
    }

    @Override
    public void deleteById(Long id) {
        User user = userRepository.findById(id).get();
        user.setStatus(0);
        userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        User user1 = userRepository.findById(user.getId()).get();
//        if (user1.getStatus()!=0){
//            user1.setName(user.getName());
//            user1.setModifiedDate(LocalDateTime.now());
//            user1.setSurname(user.getSurname());
//            user1.setAge(user.getAge());
//            user1.setGender(user.getGender());
//            user1.setProfileImage(user.getProfileImage());
//            user1.setProfileImageUrl(user.getProfileImageUrl());
//
//            userRepository.save(user1);
//        }
        user1=user;
        userRepository.save(user1);
        return user1;
    }


}
