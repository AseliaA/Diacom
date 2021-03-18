package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User deleteUserById(Long id) {
        this.userRepository.deleteById(id);
        return null;
    }
}
