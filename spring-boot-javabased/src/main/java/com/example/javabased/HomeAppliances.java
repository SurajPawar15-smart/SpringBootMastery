package com.example.javabased;

import java.util.Arrays;
import java.util.List;

public class HomeAppliances implements ICategory {

	@Override
	public List<String> getAllProduct() {
		return Arrays.asList("Washing Machine","Mixer","Refrigerator");
	}

}
