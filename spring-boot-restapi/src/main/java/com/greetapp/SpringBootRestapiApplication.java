package com.greetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages="com.greetapp.controller"+"com.greetapp")
public class SpringBootRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestapiApplication.class, args);
	}

}
