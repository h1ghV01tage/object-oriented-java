package com.example.oop;

public class DiceGame {

	public static void main(String[] args) {
		
		//Dice related
		Dice dice = new Dice();
		dice.roll();
		
		//Player related
		Player player = new Player();
		player.setHealth(100);
		int health = player.getHealth();
		System.out.println(health);
		
	}
	
}

