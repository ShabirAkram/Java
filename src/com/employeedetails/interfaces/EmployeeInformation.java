package com.employeedetails.interfaces;

public class EmployeeInformation implements EmployeeInfo,LoginCredentials {

	@Override
	public void empName() {
		System.out.println("Md Shabir Akram K");
	}	
	@Override
	public void empEmailId() {
		System.out.println("shabir@gmail.com");	
	}	
	@Override
	public void empPhoneNo() {
		System.out.println("7339364950");
	}	
	@Override
	public void salary() {
		System.out.println("50,000");
	}
	@Override
	public void userName() {
		System.out.println("shabirAkram");
	}
	@Override
	public void password() {
		System.out.println("Shabir@1234");	
	}
	
	public static void main(String[] args) {
		EmployeeInformation e=new EmployeeInformation();
		e.empName();
		e.empEmailId();
		e.empPhoneNo();
		e.salary();
		e.userName();
		e.password();
	}
	
}
