package com.java.differentpackages1;

import com.java.differentpackages2.Institute;


import com.java.differentpackages2.Student;

public class Employee {
	
	public void employeeId() {
		System.out.println("007");
	}
	public void employeeName() {
		System.out.println("Akram");
	}
	public void experienceYears() {
		System.out.println("7");
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.employeeId();
		e.employeeName();
		e.experienceYears();
		
		Institute i=new Institute();
		i.instituteName();
		i.instituteAddress();
		i.courseName();
		
		Student s=new Student();
		s.studentName();
		s.studentId();
		s.studentAddress();	
	}

}
