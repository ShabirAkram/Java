package com.employeedetails.abstraction;

public class EmployeeInformation extends EmployeeInfo {

	@Override
	public void salary() {
		System.out.println("50,000");
	}
	
	public static void main(String[] args) {
		EmployeeInformation e=new EmployeeInformation();
		e.empName();
		e.empEmailId();
		e.empPhoneNo();
		e.salary();
	}
	
}
