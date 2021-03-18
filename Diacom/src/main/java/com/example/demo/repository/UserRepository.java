package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@SpringBootApplication(scanBasePackages={
//        "com.example.Repository"
//})

@Repository
public interface UserRepository
        extends JpaRepository<User,Long> {
}
