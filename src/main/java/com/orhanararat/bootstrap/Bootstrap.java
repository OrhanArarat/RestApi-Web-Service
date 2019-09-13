package com.orhanararat.bootstrap;

import com.orhanararat.model.User;
import com.orhanararat.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class Bootstrap implements CommandLineRunner {
    private final UserRepository userRepository;

    public Bootstrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setName("User1");
        user1.setSurname("test1");
        user1.setAge(20);
        user1.setGender("Male");

        User user2 = new User();
        user2.setName("User2");
        user2.setSurname("test2");
        user2.setAge(20);
        user2.setGender("Female");

        User user3 = new User();
        user3.setName("User3");
        user3.setSurname("test3");
        user3.setAge(20);
        user3.setGender("Male");

        User user4 = new User();
        user4.setName("User4");
        user4.setSurname("test4");
        user4.setAge(20);
        user4.setGender("Female");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);

        System.out.printf("Data Loaded: " + userRepository.count());
    }
}
