package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    User addUser(User user);
    User deleteUserById(Long id);
}
