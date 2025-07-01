package com.organization.conditionstatement;

public class TheatreEntry_And {

	public static void main(String[] args) {
		
		int age=20;
		boolean validateTicket=true;
		
		if(age<18 && validateTicket==false) {
			System.out.println("Invalid Ticket but viewer below minimum age");
		}
		else if(age<18 && validateTicket==true) {
			System.out.println("Valid Ticket but viewer below minimum age");
		}
		else if(age>=18 && validateTicket==false) {
			System.out.println("Invalid Ticket & viewer meets the minimum age criteria ");
		}
		else {
			System.out.println("Valid Ticket & viwer meets the minimum age criteria");
		}
		
	}
	
}
