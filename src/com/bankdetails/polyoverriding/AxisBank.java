package com.bankdetails.polyoverriding;

public class AxisBank extends BankInfo {

	@Override
	public void deposit(double amount) {
		super.deposit(amount);
	}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit(7000);
	}
}
