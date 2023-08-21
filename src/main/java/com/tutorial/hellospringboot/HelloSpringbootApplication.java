package com.tutorial.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringbootApplication {

	public static void main(String[] args) {
		System.out.println("Server listening ar http://localhost:8080");
		SpringApplication.run(HelloSpringbootApplication.class, args);
	}

}
