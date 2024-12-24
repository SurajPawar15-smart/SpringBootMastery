package com.spring.constr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("com.spring.constr");

	        // Get the Player bean
	        Player player =context.getBean(Player.class);
	        player.getDetails();
	}

}
