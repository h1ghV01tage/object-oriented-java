package com.example.oop;

public class Player {

	private int health;
	
	public int getHealth() {
		
		return health;
		
	}
	
	public void setHealth(int h) {
		
		//validate the fact that the health can't be outside the range of 0 - 100
		if(h < 0) {
			
			health = 0;
			
		}
		else if (h > 100) {
			
			health = 100;
		}
		
		else {
			
			health = h;
		}
		
		
		
	}
	
}
