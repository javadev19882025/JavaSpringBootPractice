package com.jpa.test.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.two.dao.UserRepository;
import com.jpa.test.two.entities.User;

@SpringBootApplication
public class Bootjpaviewexample2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bootjpaviewexample2Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		// Perform CRUD Operation
		// Get All User Data by Id

		Iterable<User> itr = userRepository.findAll();
		itr.forEach(user -> {
			System.out.println(user);
		});

	}

}
