package com.jpa.CustomFinder;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.CustomFinder.dao.UserRepositorynamegender;
import com.jpa.CustomFinder.entities.User;

@SpringBootApplication
public class BootStrapCustomFinderexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootStrapCustomFinderexampleApplication.class, args);
		UserRepositorynamegender userRepository = context.getBean(UserRepositorynamegender.class);
		
		List<User> usersinfos = userRepository.findByNameAndGender("Nishi Virenbhai Sivan", "Female");
		usersinfos.forEach(e -> System.out.println(e));
	}

}
