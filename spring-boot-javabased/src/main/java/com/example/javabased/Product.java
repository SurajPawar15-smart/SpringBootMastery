package com.example.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Product {
	@Autowired
	@Qualifier("appliances")
	private ICategory category;

	public void showProducts() {
		category.getAllProduct().forEach(System.out::println);
	}

}
