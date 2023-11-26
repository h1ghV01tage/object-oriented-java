package com.example.oop;

//This is the base class which declares the fields for the object ball
//The ball hase several properties including color and weight
//the cubclasses BouncingBall, BouncingBallApp, and BaseBall class..
//they all inherit from this base class

public class Ball {
	
	
	private String color;
	private double weight;
	private int velocity;
	
	
	//main method
	public static void main(String[] args) {
		
		//throwTheSoftballWithBaseBallMethod();
		riseTheBall();
		
	}
	
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
	public void hit(Ball ball) {
		System.out.println("You hit it!");
	}
	
	//This method is very interesting because
	//it does interesting things
	//we are creating a new object of baseballball type
	//then we use the hit method to hit the ball
	//This is an example of automatic casting
	
	
	public void hitTheBaseBall() {
		
		BaseBallBall baseBallBall = new BaseBallBall();
		hit(baseBallBall);
		Ball anotherBall =  baseBallBall;
		hit(anotherBall);
		
	}
	
	//write a method to toss the baseball
	
	public static void toss(BaseBallBall b) {
		
		System.out.println("Tossing the baseball ball ! not a softball ball");
	}
	
	//create and try tossing the skewed ball
	//when trying to use a method by a base class object of the subclass type that takes
	//the parameter of the subclass object it is essential to cast the variable to the
	//subclass object type
	
	public void throwTheSkewedBall() {
		
		Ball skewedBall = new BaseBallBall();
		toss((BaseBallBall)skewedBall);
		
	}
	
	//This method creates a ball object of softball type
	//it tries to implement toss method that takes a baseballball parameter
	//while trying to cast the ball object of the softball type to ball obj of 
	//baseballball type, it throws a cast error...
	//woah ! i thought i was confused but i seem to understand all this :D :D
	public static void throwTheSoftballWithBaseBallMethod() {
		
		Ball softBall = new SoftBall();
		toss((BaseBallBall) softBall); //error: softball isn't a baseball its a softball
		
	}
	
	//method that will call a method in the subclass
	//It is essential to cast ball to softball to
	//be able to implement a method from softball
	private static void riseTheBall() {
		// TODO Auto-generated method stub
		
		//create a ball obj of softball type 
		Ball softBall = new SoftBall();
		//cast softBall ball to SoftBall
		SoftBall sBall = (SoftBall)softBall;
		sBall.riseBall();
		
	
		//This does it in a more elegant fashion
		Ball softerBall = new SoftBall();
		((SoftBall) softerBall).riseBall();
		
		
	}
	
	
	
	
}
