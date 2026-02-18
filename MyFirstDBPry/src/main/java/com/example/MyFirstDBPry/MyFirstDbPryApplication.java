package com.example.MyFirstDBPry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyFirstDbPryApplication {
	@RequestMapping("/")
	String home() {
		return "Hello Word! Spring Boot 4.0.2 is here. Samuel Salazar";
	}
	public static void main(String[] args) {
		SpringApplication.run(MyFirstDbPryApplication.class, args);
	}

}
