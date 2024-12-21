package com.spring.autowire;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("databases")
public class Database extends CourseDetails {

	@Override
	List<String> getAllCourses() {
		return Arrays.asList("MySQL","MongoDB","PostgreSQL","IBM Db2 ","CouchDB","Microsoft SQL Server");
	}

}
