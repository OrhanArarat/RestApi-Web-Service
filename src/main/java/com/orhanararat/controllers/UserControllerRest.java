package com.orhanararat.controllers;

import com.orhanararat.model.User;
import com.orhanararat.repositories.UserRepository;
import com.orhanararat.services.UserService;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControllerRest {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserControllerRest(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers() {
        return userService.findAllByStatus();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getFindById(@PathVariable Long id) {

        return userService.getUserById(id,1);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
        return "Deleted is Success";
    }


//    @PutMapping("/{id}/{name}")
//    @PutMapping("/")
//    @ResponseStatus(HttpStatus.OK)
//    public User updateUser(@RequestBody Long id, @RequestBody String name) {
//        User user = userRepository.findById(id).get();
//        user.setName(name);
//        userRepository.save(user);
//        return user;
//    }

    @PutMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public User updateUser(@RequestBody User user) {

        return userService.updateUser(user);
    }

}
