package com.example.oop;

//This class educates on constructor overloading, we have different Ctors
//these Ctors take different parameters or have different "signatures"

public class Actor {
	
	/*
	 * private String firstName;
	private String lastName;
	private boolean goodActor;
	 */

	
	private String first;
	private String last;
	private boolean good;

	//constructor 1
	public Actor(String first, String last){
		
		this.first = first;
		this.last = last;
		
	}
	
	//Constructor 2
	public Actor(String first, String last, boolean good) {
		
		this(first,last);
		this.good = good;
	}

	//an empty constructor
	public Actor() {
		// TODO Auto-generated constructor stub
		
	}
	
	public String getActorName() {
		
		return this.first + this.last;
		
	}
	
}




