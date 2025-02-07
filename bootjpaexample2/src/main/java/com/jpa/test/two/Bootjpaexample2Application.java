package com.jpa.test.two;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.two.dao.UserRepository;
import com.jpa.test.two.entities.User;

@SpringBootApplication
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

		// Perform CRUD Operation
		// Create Various Object for Users

		/*
		 * User user1 = new User();
		 * 
		 * user1.setName("Vinay Raj Patel"); user1.setGender("Male");
		 * user1.setDesignation("Full Stack Software Devloper"); user1.setAge(27);
		 * user1.setSalary(190000);
		 * 
		 * User user2 = new User();
		 * 
		 * user2.setName("Shurbhi Ankit Bhatt"); user2.setGender("Female");
		 * user2.setDesignation("HR"); user2.setAge(54); user2.setSalary(25000);
		 * 
		 * User user3 = new User();
		 * 
		 * user3.setName("Swati Manubhai Vasava"); user3.setGender("Female");
		 * user3.setDesignation("Senior Product executive"); user3.setAge(29);
		 * user3.setSalary(45000);
		 * 
		 * User user4 = new User();
		 * 
		 * user4.setName("Nishi Virenbhai Sivan"); user4.setGender("Female");
		 * user4.setDesignation("Senior Sales executive"); user4.setAge(34);
		 * user4.setSalary(45000);
		 * 
		 * User user5 = new User();
		 * 
		 * user5.setName("Suri Nishant Viani"); user5.setGender("Female");
		 * user5.setDesignation("Senior Back Office executive"); user5.setAge(44);
		 * user5.setSalary(65000);
		 * 
		 * List<User> users = List.of(user1, user2, user3, user4, user5); Iterable<User>
		 * result = userRepository.saveAll(users);
		 * 
		 * result.forEach(user -> { System.out.println(user); });
		 */

		// Update User

		/*
		 * Optional<User> optional = userRepository.findById(4); User user =
		 * optional.get(); user.setAge(24); User result = userRepository.save(user);
		 * System.out.println(result);
		 */

		// Get User Data by Id

		/*
		 * Iterable<User> itr = userRepository.findAll(); itr.forEach(user -> {
		 * System.out.println(user); });
		 */

		// Remove User Data by Id

		// userRepository.deleteById(4); System.out.println("deleted");

		// delete all Users

		/*
		 * Iterable<User> allusers = userRepository.findAll(); allusers.forEach(user ->
		 * System.out.println(user)); userRepository.deleteAll(allusers);
		 */

		/*
		 * List<User> users = userRepository.findByName("Shurbhi Ankit Bhatt");
		 * users.forEach(e -> System.out.println(e));
		 */
		/*
		 * List<User> usersinfo =
		 * userRepository.findByNameAndGender("Shurbhi Ankit Bhatt", "Female");
		 * usersinfo.forEach(e -> System.out.println(e));
		 */

		/*
		 * List<User> allusersinfo = userRepository.findallUsers();
		 * allusersinfo.forEach(e -> System.out.println(e));
		 */

		/*
		 * List<User> allusersinfo =
		 * userRepository.getUsersByName("Swati Manubhai Vasava"
		 * ,"Senior Product executive"); allusersinfo.forEach(e ->
		 * System.out.println(e));
		 */

	//	userRepository.getAllUsers().forEach(e -> System.out.println(e));
	}

}
