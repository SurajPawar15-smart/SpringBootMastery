package com.spring.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Accessories {
	private String itemName;
    private int itemCount;
    
    public String getItemName() {
		return itemName;
	}
    @Value("${accessories.itemname}")
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCount() {
		return itemCount;
	}
	@Value("${accessories.itemcount}")
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	public Accessories(String itemName, int itemCount) {
		super();
		this.itemName = itemName;
		this.itemCount = itemCount;
	}
	@Override
    public String toString() {
        return "Item Name: " + itemName + ", Item Count: " + itemCount;
    }
}
