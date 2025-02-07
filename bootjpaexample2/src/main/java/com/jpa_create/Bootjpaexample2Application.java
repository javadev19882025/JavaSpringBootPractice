package com.jpa_create;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa_create.dao.UserRepository;
import com.jpa_create.entities.User;

@SpringBootApplication
@EntityScan(basePackages = "com.jpa_create.entities")
public class Bootjpaexample2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bootjpaexample2Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		User user = new User();
		user.setName("Dinesh Vinod Shah");
		user.setGender("Male");
		user.setDesignation("Software Devloper");
		user.setAge(37);
		user.setSalary(90000);
		User userinfo = userRepository.save(user);
		System.out.println(userinfo);

	}

}
