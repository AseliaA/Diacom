package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.example.demo"})
@RestController
public class DiacomApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiacomApplication.class, args);
	}

}
