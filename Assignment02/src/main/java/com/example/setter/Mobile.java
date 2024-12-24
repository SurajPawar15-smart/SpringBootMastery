package com.example.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Mobile {
	private String model;
    private String brand;
    private double price;
    private Features features;
    
    @Value("${mobile.model}")
    public void setModel(String model) {
		this.model = model;
	}

    @Value("${mobile.brand}")
	public void setBrand(String brand) {
		this.brand = brand;
	}

    @Value("${mobile.price}")
	public void setPrice(double price) {
		this.price = price;
	}

    @Autowired
	public void setFeatures(Features features) {
		this.features = features;
	}

	public void printFeatures() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        String a=features.getColor();
        String b=features.getMemory();
        String c=features.getOs();
        System.out.println("Color: " + a);
        System.out.println("OS: " + b);
        System.out.println("Memory: " + c);
    }
}

