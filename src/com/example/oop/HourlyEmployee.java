package com.example.oop;

public class HourlyEmployee extends Employee{
	
	//declare the field for hourly employee
	private double hourlyRate;
	
	//declare constructor to set the field values
	public HourlyEmployee(long employeeId, String employeeName, double hourlyRate) {
		super(employeeId, employeeName);
		this.hourlyRate = hourlyRate;
	
	}
	
	//declare the getter method to get the field data
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public String getFormattedRate() {
		
		return String.format("$%.2f", hourlyRate);
	}
	
	
}
