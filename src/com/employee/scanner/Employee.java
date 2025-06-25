package com.employee.scanner;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);	
	
	System.out.println("Enter your name:");
	String nextLine = s.nextLine();
	System.out.println("Employee name is " +nextLine);
	
	System.out.println("Enter your gender:");
	String nextLine2 = s.nextLine();
	System.out.println("Employee gender is " + nextLine2);
	
	System.out.println("Enter your city:");
	String nextLine3 = s.nextLine();
	System.out.println("Employee city is " + nextLine3);
	
	System.out.println("Enter your employee id:");
	short nextShort = s.nextShort();
	System.out.println("Employee id is " + nextShort);
	
	System.out.println("Enter your email id:");
	String next = s.next();
	System.out.println("Employee email id is " + next);
	
	System.out.println("Enter your phone number:");
	long nextLong = s.nextLong();
	System.out.println("Employee phone number is " + nextLong);
	
	System.out.println("Enter your salary:");
	int nextInt = s.nextInt();
	System.out.println("Employee salary is " + nextInt);
	
	System.out.println("Enter your age:");
	byte nextByte = s.nextByte();
	System.out.println("Employee age is " + nextByte);
	
	System.out.println("Enter your weight:");
	float nextFloat = s.nextFloat();
	System.out.println("Employee weight is " + nextFloat);
	
	System.out.println("Enter your height:");
	double nextDouble = s.nextDouble();
	System.out.println("Employee height is " + nextDouble);
	
	System.out.println("Employee is on Leave");
	boolean nextBoolean = s.nextBoolean();
	System.out.println(nextBoolean);
	
	}
	
}
