package com.example.oop;

import java.util.Scanner;

public class PrimeClass {

	private Scanner scanner = new Scanner(System.in);
	
	public int x = getX();
	
	public int getX()
	{
		System.out.println("Enter the starting value for x");
		return scanner.nextInt();
		
	}
	
}
