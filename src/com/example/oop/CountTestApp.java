package com.example.oop;

//This application counts the number of instances of a class

public class CountTestApp {
	
	
	static int count;
	
	public static void main(String[] args) {
		
		printCount();
		for(int i = 0; i < 10; i++) {
			CountTest countTest = new CountTest();
			printCount();
		}
		
	}

	private static void printCount() {
		// TODO Auto-generated method stub
		count = CountTest.getInstanceCount();
		System.out.println("There are "  + count + " " + "instances of the CountTestClass");
	}
	
}
