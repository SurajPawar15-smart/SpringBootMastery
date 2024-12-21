package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape{

	@Override
	public void area(double x, double y) {
		// TODO Auto-generated method stub
		System.out.println("Triangle "+(0.5*x*y));
	}

}
