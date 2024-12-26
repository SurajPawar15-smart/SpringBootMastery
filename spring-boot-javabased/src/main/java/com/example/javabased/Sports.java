package com.example.javabased;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Sports implements ICategory {

	@Override
	public List<String> getAllProduct() {
		return Arrays.asList("Bat","Ball","Shoes");
	}

}
