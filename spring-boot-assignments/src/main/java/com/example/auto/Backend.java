package com.example.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Backend implements ICourse{

	@Override
	public List<String> getAllCourses() {
		return Arrays.asList("Java", "Python","C#","Microservices",".Net");
	}

}
