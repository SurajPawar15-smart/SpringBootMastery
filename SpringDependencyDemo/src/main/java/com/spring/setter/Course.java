package com.spring.setter;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Course {
 public List<String> getAll(String type){
	 if(type.equals("frontend"))
		 return Arrays.asList("HTML5","CSS3","JavaScript","TypeScript","ReactJS","Angular");
	 if(type.equals("backend"))
		 return Arrays.asList("JAVA","Python","PHP","Go","Rust","C#");
	 if(type.equals("database"))
		 return Arrays.asList("MySQL","MongoDB","PostgreSQL","IBM Db2 ","CouchDB","Microsoft SQL Server");
	 else
		 return Arrays.asList("No courses available...!!!");
 }
}
