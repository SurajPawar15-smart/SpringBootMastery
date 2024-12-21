package com.spring.autowire;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	//autowiring by type
	@Autowired
	@Qualifier("frontend")
	private CourseDetails courseDetails;
	
	//autowiring by Name
	@Autowired
	private CourseDetails backend;
	
	//autowired by Constructor
	private CourseDetails details;
	public Student(@Qualifier("databases") CourseDetails details) {
		super();
		this.details = details;
	}

	public List<String> showCourses(String choice){
		if(choice.equals("f"))
			return courseDetails.getAllCourses();
		if(choice.equals("b"))
			return backend.getAllCourses();
		if(choice.equals("d"))
			return details.getAllCourses();
		else {
			return Arrays.asList("No courses available...!!!");
		}
		

		
	}
}
