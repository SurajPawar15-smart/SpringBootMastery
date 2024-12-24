package com.example.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterMain {

	public static void main(String[] args) {
		//create the IOC container
		ApplicationContext context=new AnnotationConfigApplicationContext("com.example.setter");
		Mobile mobile = (Mobile) context.getBean("mobile");
        mobile.printFeatures();

	}

}
