package com.example.oop;


//In this app, we will call the singleton class once and twice
//to find out whether or not they have the same instance
public class CallingSingletonApp {

	public static void main(String[] args) {
		
		SingletonClass singletonClass = SingletonClass.getInstance();
		
		SingletonClass multitonClass = SingletonClass.getInstance();
		
		if(singletonClass == multitonClass) {
			System.out.println("The objects are same");
		}
		
		else {
			System.out.println("The objects aren't same");
		}
	}
	
}
