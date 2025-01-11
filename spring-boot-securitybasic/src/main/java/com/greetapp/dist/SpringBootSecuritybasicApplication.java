package com.greetapp.dist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.greetapp.controller,com.greetapp.dist")
public class SpringBootSecuritybasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecuritybasicApplication.class, args);
	}

}
