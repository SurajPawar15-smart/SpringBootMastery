package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements IShape{

	@Override
	public void area(double x, double y) {
		// TODO Auto-generated method stub
		System.out.println("Rectange "+(x*y));
		
	}

}
