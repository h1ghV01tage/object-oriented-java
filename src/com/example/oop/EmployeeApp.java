package com.example.oop;

//This application uses instanceof operator to determine
//whether the type of object returned by getEmployee method

public class EmployeeApp {

	public static void main(String[] args) {
		
		Employee employee = getEmployee();
		String msg;
		
		if(employee instanceof SalariedEmployee) {
			
			msg = "The salary is " + ((SalariedEmployee) employee).getFormattedSalary();
			System.out.println(msg);
			
		}
		
		else {
			
			msg = "The hourly rate is " + ((HourlyEmployee)employee).getFormattedRate();
			System.out.println(msg);
		}
		
	}

	private static Employee getEmployee() {
		// TODO Auto-generated method stub
		return new HourlyEmployee(10, "Carlos", 10000);
	}
	
}
