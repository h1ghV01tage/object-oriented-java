package com.example.oop;

public class Player {
	
	//declare the health field
	private int health;
	
	//define the getter
	public int getHealth() {
		
		return health;
		
	}
	
	//define the setter
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
	
	//define the method for the tictactoe game
	public int move() {
		
		for(int i = 0; i < 9; i++) {
			
			System.out.println("The basic player says");
			System.out.println();
			System.out.println("I'll take the first open square");
			return firstOpenSquare();
		}
		
		return -1;
		
	}

	private int firstOpenSquare() {
		// TODO Auto-generated method stub
		int square = 0;
		//code to find the square
		
		return square;
	}
	
	
}
