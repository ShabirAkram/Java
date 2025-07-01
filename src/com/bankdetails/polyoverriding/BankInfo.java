package com.bankdetails.polyoverriding;

public class BankInfo {

	public void saving(double amount) {
		System.out.println("The total saving amount in your account is " + amount);
	}
	
	public void fixed(float value) {
		System.out.println("The total fixed amount in your account is "+ value);
	}
	
	public void deposit(double amount) {
		System.out.println("The total amount you deposited is " +amount);
	}
	
	public static void main(String[] args) {
		BankInfo bi=new BankInfo();
		bi.saving(10000.00);
		bi.fixed(5000.00f);
		bi.deposit(5000.00);
	}
	
}
