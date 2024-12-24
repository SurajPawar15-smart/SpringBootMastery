package com.spring.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class Sports {
	private String type;
    private int playerCount;
    private Accessories accessories;
    private String name;
    
    public String getName() {
		return name;
	}
    @Value("${sports.name}")
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	 @Value("${sports.type}")
	public void setType(String type) {
		this.type = type;
	}
	public int getPlayerCount() {
		return playerCount;
	}
	@Value("${sports.count}")
	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}
	public Sports(Accessories accessories) {
		super();
		this.accessories = accessories;
	}
	
	void printAccessories() {
		System.out.println(accessories.getItemCount());
        System.out.println(accessories.getItemName());
	}
    
	
}
