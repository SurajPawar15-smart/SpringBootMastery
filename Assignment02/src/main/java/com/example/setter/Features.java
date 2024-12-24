package com.example.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Features {
	
	private String color;
    private String os;
    private String memory;

	public String getColor() {
		return color;
	}
	@Value("${mobile.feature.color}")
	public void setColor(String color) {
		this.color = color;
	}
	public String getOs() {
		return os;
	}
	@Value("${mobile.feature.os}")
	public void setOs(String os) {
		this.os = os;
	}
	public String getMemory() {
		return memory;
	}
	@Value("${mobile.feature.memory}")
	public void setMemory(String memory) {
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "Features [color=" + color + ", os=" + os + ", memory=" + memory + "]";
	}
}
