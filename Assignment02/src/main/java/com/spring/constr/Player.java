package com.spring.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class Player {
	private String name;
    private String city;
    private int age;
    private Sports sports;

    @Value("${name}")
    public void setName(String name) {
		this.name = name;
	}
    @Value("${city}")
	public void setCity(String city) {
		this.city = city;
	}
    @Value("${age}")
	public void setAge(int age) {
		this.age = age;
	}

	public Player(Sports sports) {
		super();
		this.sports = sports;
	}

    public void getDetails() {
        System.out.println("Player Name: " +name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
        Integer playercount=sports.getPlayerCount();
        System.out.println(playercount);
        String type=sports.getType();
        System.out.println(type);
     
        
    }
}
