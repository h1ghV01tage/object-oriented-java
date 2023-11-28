package com.example.oop;

//This app demonstrates late binding technique
//it means that java doesn't hardwire a method but waits until program execs
//to determine exactly which method to call

public class TicTacToeApp implements Playable, CardGame  {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		Player p2 = new BetterPlayer();
		playTheGame(p1,p2);
		
	}

	private static void playTheGame(Player p1, Player p2) {
		// TODO Auto-generated method stub
		p1.move();
		p2.move();
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	
}
