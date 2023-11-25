package com.example.oop;

//This class educates on constructor overloading, we have different Ctors
//these Ctors take different parameters or have different "signatures"

public class Actor {
	
	private String firstName;
	private String lastName;
	private boolean goodActor;
	
	public Actor(String first, String last){
		
		firstName = first;
		lastName = last;
		
	}
	
	public Actor(String first, String last, boolean good) {
		
		firstName = first;
		lastName = last;
		goodActor = good;
	}

	public Actor() {
		// TODO Auto-generated constructor stub
	}
	
}




