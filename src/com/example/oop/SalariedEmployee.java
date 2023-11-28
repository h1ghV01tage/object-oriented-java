package com.example.oop;

public class SalariedEmployee extends Employee {

	//Declare the fields for salaried employee sub-class
		private double employeeSalary;
	
	//Declare constructor for the subclass
	public SalariedEmployee(long employeeId, String employeeName, double employeeSalary) {
		super(employeeId, employeeName);
		this.employeeSalary = employeeSalary;
		
	}

	//Getter methods for the subclass

	public double getEmployeeSalary() {
		return employeeSalary;
	}
	
	public String getFormattedSalary() {
		
		return String.format("$%.2f",employeeSalary);
	}

	
}
