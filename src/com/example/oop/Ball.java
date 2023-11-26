package com.example.oop;

//This is the base class which declares the fields for the object ball
//The ball hase several properties including color and weight
//the cubclasses BouncingBall, BouncingBallApp, and BaseBall class..
//they all inherit from this base class

public class Ball {
	
	
	private String color;
	private double weight;
	private int velocity;
	
	//Constructor for the ball
	public Ball() {

		System.out.println("Hello I'm the ball Ctor");
		
	}
	
	//another constructor but this one sets the weight
	public Ball(double weight) {
		
		this.weight = weight;
		
	}
	
	//getters and setters for the velocity field
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
	public int getVelocity() {
		return velocity;
	}
	
	
	//getters and setters for the color field
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//getters and setters for the weight field
	protected double getWeight() {
		
		return this.weight;
	}
	
	protected void setWeight(double weight) {
		
		this.weight = weight;
	}
	
	
	//Methods
	
	//Hit the ball
	public void hit() {
		System.out.println("You hit it!");
	}
}
