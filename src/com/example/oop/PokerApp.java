package com.example.oop;

//This app calls a method that returns an object that implements the payable interface
//object is assigned to variable of type playable
//Play method of the object is called

public class PokerApp {

	public static void main(String[] args) {
		
		
		Playable game = getGame();
		game.play();
		
		
	}

	private static Playable getGame() {
		// TODO Auto-generated method stub
		Poker poker = new Poker();
		return poker;
	}
}
