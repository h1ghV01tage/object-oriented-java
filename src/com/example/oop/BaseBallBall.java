package com.example.oop;

//This subclass inherits from the parent ball
public class BaseBallBall extends Ball {
	
	public BaseBallBall() {
		//set the default value of weight of the ball
		//by invoking the super
		super(4.5);
		
		//change the weight of baseball because it is
		//heavier than the default size of the ball
		setWeight(5.125);
		System.out.println("Hello from the baseball Ctor");
		
	}
	
	public void hit() {
		
	
		System.out.println("You hit the baseball");
		super.hit();
		
	}
	
}
