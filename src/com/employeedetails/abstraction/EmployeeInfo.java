package com.employeedetails.abstraction;

public abstract class EmployeeInfo {

	public void empName() {
		System.out.println("Md Shabir Akram K");
	}
	
	public void empEmailId() {
		System.out.println("shabir@gmail.com");
	}
	
	public void empPhoneNo() {
		System.out.println("7339364950");
	}
	
	public void empDesignation() {
		System.out.println("Software Tester");
	}
	
	public abstract void salary();
	
}
