package com.example.starterboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homehandlercontroller {

	@RequestMapping("/")
	public String home() {
		System.out.println("Welcome to My Home Page");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("Welcome to My Contact Page");
		return "contact";
	}
}
