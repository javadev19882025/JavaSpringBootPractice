package com.jpa_update.user;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa_update.user.dao.UserRepository;
import com.jpa_update.user.entities.User;

@SpringBootApplication
public class Bootjpaupdateexample2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bootjpaupdateexample2Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		// Perform CRUD Operation
		// Update User By userId

		try {
			Optional<User> optional = userRepository.findById(4);
			if (optional.isPresent()) {
				User usr = optional.get();
				usr.setName("Nishika Virajbhai Shivam");
				User result = userRepository.save(usr);
				System.out.println("User updated successfully: " + result);
			} else {
				System.out.println("User not found.");
			}
		} catch (Exception e) {
			System.err.println("An error occurred while updating the user: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
