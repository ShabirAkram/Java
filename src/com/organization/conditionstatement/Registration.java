package com.organization.conditionstatement;

public class Registration {

	public static void main(String[] args) {
		
		int age=20;
		int nationalityCode=12;
		
		if(nationalityCode == 12) {
			System.out.println("He/She is Indian and eligible to vote");
		
			if(age>=18) {
				System.out.println("He/She is 18 or older and eligible to vote ");
			}
			else {
				System.out.println("He/She is not 18 and not eligible to vote");
			}
		}
		else {
			System.out.println("He/She is not Indian and not eligible to vote ");
		}
		
	}
	
}
