package com.example.oop;

//This is a demo of a recursive Ctor
public class CrazyClass {

	
	private String firstString;
	private String secondString;
	
	public CrazyClass(String first, String second){
		
		this(first);
		secondString = second;
		
	}
	
	public CrazyClass(String first) {
		
		this(first, "DEFAULT");
		
	}
	
}
