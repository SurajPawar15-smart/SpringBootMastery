package com.example.auto1;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Chinese implements IMenu {

	@Override
	public List<String> itemsAvailable() {
//		if(type.equals("starter"))
//			return Arrays.asList("starters")
//		if(type.equals("maincourse"))
//			return Arrays.asList("maincourse")	
//		if(type.equals("deserts"))
//			return Arrays.asList("deserts")	
		return Arrays.asList("Fried Rice","Wonton Soup","Noodles");
	}

}
