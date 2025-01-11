package com.greetapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	@GetMapping("/greet/{username}")
	public String greetMessage(@PathVariable("username") String username) {
		return "Greet Day " + username;
	}

	@GetMapping("/show-books")
	public List<String> showBooks() {
		return List.of("Java", "Python", "Angular", "ReactJS");
	}
}
