package com.example.oop;

//This class executes the methods of the subclass ball
//and baseball

public class BaseBallApp {

	public static void main(String[] args) {
		
		BaseBallBall baseBallBall = new BaseBallBall();
		baseBallBall.hit();
		double ballWeight = baseBallBall.getWeight();
		System.out.println(ballWeight);
	}
	
}
