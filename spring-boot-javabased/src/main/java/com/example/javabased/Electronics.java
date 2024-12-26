package com.example.javabased;

import java.util.Arrays;
import java.util.List;

public class Electronics implements ICategory {

	@Override
	public List<String> getAllProduct() {
		return Arrays.asList("Television","Xbox","Speakers");
	}

}
