package com.jpa_create.objectuser;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa_create.objectuser.dao.UserRepository;
import com.jpa_create.objectuser.entities.User;

@SpringBootApplication
public class Bootjpaexample2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bootjpaexample2Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		// Perform CRUD Operation
		// Create Various Object for Users

		User user1 = new User();

		user1.setName("Vinay Raj Patel");
		user1.setGender("Male");
		user1.setDesignation("Full Stack Software Devloper");
		user1.setAge(27);
		user1.setSalary(190000);

		User user2 = new User();

		user2.setName("Shurbhi Ankit Bhatt");
		user2.setGender("Female");
		user2.setDesignation("HR");
		user2.setAge(54);
		user2.setSalary(25000);

		User user3 = new User();

		user3.setName("Swati Manubhai Vasava");
		user3.setGender("Female");
		user3.setDesignation("Senior Product executive");
		user3.setAge(29);
		user3.setSalary(45000);

		User user4 = new User();

		user4.setName("Nishi Virenbhai Sivan");
		user4.setGender("Female");
		user4.setDesignation("Senior Sales executive");
		user4.setAge(34);
		user4.setSalary(45000);

		User user5 = new User();

		user5.setName("Suri Nishant Viani");
		user5.setGender("Female");
		user5.setDesignation("Senior Back Office executive");
		user5.setAge(44);
		user5.setSalary(65000);

		List<User> users = List.of(user1, user2, user3, user4, user5);
		Iterable<User> result = userRepository.saveAll(users);

		result.forEach(user -> {
			System.out.println(user);
		});

	}

}
