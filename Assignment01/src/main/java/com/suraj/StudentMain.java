package com.suraj;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new AnnotationConfigApplicationContext("com.suraj");
        Student student = context.getBean(Student.class);
        student.printDetails();
        List<String> courses = student.showCourses();
        System.out.println("Courses: " + courses);

	}

}
