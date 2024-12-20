package com.suraj.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee employee=new Employee();
//		employee.setEmployeeName("Priya");
//		String msg= employee.greet();
//		System.out.println(msg);
		
		//create the IOC Container
		ApplicationContext context=new AnnotationConfigApplicationContext("com.suraj.training");
		String[] beannames=context.getBeanDefinitionNames();
		for(String bean:beannames) {
			System.out.println(bean);
		}
		
		Employee employee=(Employee)context.getBean("employee");
		String msg=employee.greet();
		System.out.println(msg);
		
		employee=context.getBean(Employee.class);
		msg=employee.greet();
		System.out.println(msg);
		
		employee=(Employee)context.getBean("employee",Employee.class);
		msg=employee.greet();
		System.out.println(msg);
		
	}

}
