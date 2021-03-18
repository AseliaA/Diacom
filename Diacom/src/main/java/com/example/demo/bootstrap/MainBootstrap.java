package com.example.demo.bootstrap;

import com.example.demo.enums.SugarType;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MainBootstrap implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User.Builder("Aselia", "Azim",
                18, 876, "login", "password").
                withSugarType(SugarType.secondTypeOfSugar).build();
        userRepository.save(user);

    }
}
