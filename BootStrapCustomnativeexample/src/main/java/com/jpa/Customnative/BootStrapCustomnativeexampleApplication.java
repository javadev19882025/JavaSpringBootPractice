package com.jpa.Customnative;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jpa.CustomNativeFinder.dao.UserRepositoryJPQL;
import com.jpa.CustomNativeFinder.entities.User;

@SpringBootApplication
@EntityScan(basePackages = "com.jpa.CustomNativeFinder.entities")
@EnableJpaRepositories(basePackages = "com.jpa.CustomNativeFinder.dao")

public class BootStrapCustomnativeexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootStrapCustomnativeexampleApplication.class, args);
		UserRepositoryJPQL userRepository = context.getBean(UserRepositoryJPQL.class);

		System.out.println("\n\n");
		System.out.println("First JPQL Query \n\n");

		List<User> allUser = userRepository.findallUsers();
		allUser.forEach(e -> {
			System.out.println(e);
		});

		System.out.println("\n\n");
		System.out.println("Second JPQL Query \n\n");

		List<User> UserByName = userRepository.getUsersByName("Vinay Raj Patel", "Full Stack Software Devloper");
		UserByName.forEach(e -> {
			System.out.println(e);
		});

		System.out.println("\n\n");
		System.out.println("Third JPQL Query \n\n");

		userRepository.getAllUsers().forEach(e -> {
			System.out.println(e);
		});
	}

}
