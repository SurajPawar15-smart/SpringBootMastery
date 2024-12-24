package com.example.auto1;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Indian implements IMenu{

	@Override
	public List<String> itemsAvailable() {
		return Arrays.asList("Roti","Dosa","Biryani");
	}

}
