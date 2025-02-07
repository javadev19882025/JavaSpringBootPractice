package com.jpa.test.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.two.dao.UserRepository;
import com.jpa.test.two.entities.User;

@SpringBootApplication
public class Bootjparemoveexample2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bootjparemoveexample2Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		// Perform CRUD Operation
		// Get remove User Data by Id
		userRepository.deleteById(3);
		System.out.println("user deleted successfully");

	}

}
