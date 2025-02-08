package com.jpa.CustomFinder;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.CustomFinder.dao.UserRepositoryname;
import com.jpa.CustomFinder.entities.User;

@SpringBootApplication
public class BootStrapCustomFinderexampleApplication2 {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootStrapCustomFinderexampleApplication2.class, args);
		UserRepositoryname userRepository = context.getBean(UserRepositoryname.class);

		List<User> usersinfo = userRepository.findByName("Shurbhi Ankit Bhatt");
		usersinfo.forEach(e -> System.out.println(e));

	}

}
