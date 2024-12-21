package com.spring.autowire;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("backend")
public class Backend extends CourseDetails {

	@Override
	List<String> getAllCourses() {
		return Arrays.asList("JAVA","Python","PHP","Go","Rust","C#");
	}

}
