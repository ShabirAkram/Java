package com.employeedetails.polyoverloading;

public class Employee {
	
	public void empId(int id) {
		System.out.println("Employee id is " + id);
	}
	
	public void empId(String name) {
		System.out.println("Employee name is " + name);
	}
	
	public void empId(long phoneNumber) {
		System.out.println("Employee contact number is " + phoneNumber);
	}
	
	public void empId(float salary) {
		System.out.println("Salary is " + salary + " Lpa");
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId(567);
		e.empId("Md Shabir Akram K");
		e.empId(7339364950l);
		e.empId(5.5f);
	}

}
