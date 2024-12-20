package com.suraj;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Student {
	
@Value("${student.name}")	
private String studentName;

@Value("${student.id}")
private int studentId;

@Value("${student.city}")
private String city;

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public void setCity(String city) {
	this.city = city;
}

public void printDetails() {
	System.out.println("Name: " + studentName);
    System.out.println("ID: " + studentId);
    System.out.println("City: " + city);
}

public List<String> showCourses() {
    return Arrays.asList("Java", "Spring Boot", "Microservices", "Hibernate");
}

}
