package com.example.oop;

public final class Person {

	//properties
	private final String firstName;
	private final String lastName;
	
	//constructor
	public Person(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public String firstName() {
		return firstName;
	}
	
	public String lastName() {
		return lastName;
	}
	
	public static void main(String[] args) {
		
		Person person = new Person("William","Shakespeare");
		System.out.println(person.firstName  + " " + person.lastName);
		
	}
	
}
