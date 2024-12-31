package com.greetapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	// http://localhost:8080/great
	@GetMapping("/great")
	public String greetMessage() {
		return "Have a nice day...!!!";
	}

	// http://localhost:8080/welcome?username=Suraj&city=Pune
	@GetMapping("/welcome")
	public String welcomeUser(@RequestParam("username") String user, @RequestParam("city") String city) {
		return " Welcome " + user + " from " + city;
	}

	// http://localhost:8080/show-books
	@GetMapping("show-books")
	public List<String> showBooks() {
		return Arrays.asList("Core Java", "Advance Java", "Hibernate", "Spring Boot");
	}

	// http://localhost:8080/show-options/tech
	// http://localhost:8080/show-options/selfhelp
	@GetMapping("show-options/{category}")
	public List<String> showOptionsBooks(@PathVariable("category") String type) {
		if (type.equals("tech"))
			return Arrays.asList("Core Java", "Advance Java", "Hibernate", "Spring Boot");
		else
			return Arrays.asList("Secret", "Cartoon", "Horrer", "Magic", "Color Books");
	}
}
