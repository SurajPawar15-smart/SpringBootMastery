package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component("square")
public class Sqaure implements IShape{

	@Override
	public void area(double x, double y) {
		// TODO Auto-generated method stub
		System.out.println("Square "+(x*y));
		
	}

}
