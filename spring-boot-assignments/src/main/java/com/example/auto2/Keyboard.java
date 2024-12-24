package com.example.auto2;

import org.springframework.stereotype.Component;

@Component
public class Keyboard implements IInstrument{

	@Override
	public void playSong(String song) {
		System.out.println("Playing this "+song+ " using Keyboard");
		
	}
	

}
