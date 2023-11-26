package com.example.oop;

public class CountTest {

	private static int instanceCount;
	
	public CountTest() {
		instanceCount++;
	}
	
	public static int getInstanceCount() {
		return instanceCount;
	}
	
}
