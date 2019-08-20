package com.orhanararat.bootstrap;

import com.orhanararat.model.User;
import com.orhanararat.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    private final UserRepository userRepository;

    public Bootstrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setName("User1");
        User user2 = new User();
        user2.setName("User2");
        User user3 = new User();
        user3.setName("User3");
        User user4 = new User();
        user4.setName("User4");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);

        System.out.printf("Data Loaded: "+userRepository.count());
    }
}
