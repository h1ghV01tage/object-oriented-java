package com.example.oop;

//This class is a base class that does a lot
/*
 * it has two methods so far
 * the first method is play which calls the second method startgame
 * the startgame method takes two parameters "deck of the type dealable and String value game that
 * determines the type of game to be played
 * the method then does if else checks to compare the string to game names and determine the deck size
 * calling the deal method that is implemented in the interface dealable and cardgame 
 */
public class Game {

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing game");
		Dealable d = new CardDeck();
		startGame(d,"hearts");
		CardDeck cd = new CardDeck();
		startGame(cd,"gin");
	}
	
	public void startGame(Dealable deck, String game) {
		
		if(game.equalsIgnoreCase("Poker")) {
			deck.deal(5);
		}
		
		else if (game.equalsIgnoreCase("Hearts")) {
			deck.deal(13);
		}
		
		else if(game.equalsIgnoreCase("Gin")) {
			deck.deal(10);
		}
		
	}
	
}
