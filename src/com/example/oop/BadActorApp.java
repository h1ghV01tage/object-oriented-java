package com.example.oop;

//This class takes actor Ctors from the actor class
//the fundamental implication beside this application is that
//if a Ctor is declared in the class than default Ctor is not provided by java
//free of charge, meaning that the programmer explicitly has to write an empty Ctor
//It fails at first and only compiles after programmer writes an empty Ctor
public class BadActorApp {

	public static void main(String[] args) {
		
		Actor actor = new Actor();
		
	}
	
}
