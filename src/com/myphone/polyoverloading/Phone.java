package com.myphone.polyoverloading;

public class Phone {

	public void phoneInfo(int countryCode,long phoneNumber) {
		System.out.println("+"+countryCode+" "+phoneNumber);
	}
	
	public void phoneInfo(long phoneNumber,int countryCode) {
		System.out.println(phoneNumber+"-"+countryCode);
	}
	
	public static void main(String[] args) {
		Phone p=new Phone();
		p.phoneInfo(91, 7339364950l);
		p.phoneInfo(7339364950l, 91);
	}
	
}
