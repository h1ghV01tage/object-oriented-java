package com.example.oop;

//This application utilizes the super class "Ball" and subclass "BouncingBall"

public class BouncingBallApp {
	
	public static void main(String[] args) {
		
		BouncingBall bouncingBall = new BouncingBall();
		bouncingBall.setColor("red");
		bouncingBall.bounce();
		String ballColor = bouncingBall.getColor();
		System.out.println("I am " + ballColor + " in color");
		
	}
}
