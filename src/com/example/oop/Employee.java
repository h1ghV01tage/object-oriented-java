package com.example.oop;

public class Employee {
	
	//Declare the fields for employee class
	private long employeeId;
	private String employeeName;
	
	//declare the constructor for employee class
	public Employee(long employeeId, String employeeName) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		
	}
	
	//declare the getter methods for the employee baseclass
	public String getEmployeeName() {
		return employeeName;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}
	
	
}
