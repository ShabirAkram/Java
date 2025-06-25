package com.companydetails.polyoverloading;

public class CompanyInfo {

	public void companyName(int id) {
		System.out.println("Company id is " + id);
	}
	
	public void companyName(int id,String name) {
		System.out.println("Company id is " +id+" and company name is "+name);
	}
	
	public void companyName(int id,String name,String address) {
		System.out.println("Company id is " +id+" and company name is "+name + " and company address is "+ address);
	}
	
	public void companyName(int id,String name,int pincode) {
		System.out.println("Company id is "+id+" and company name is "+name+" and company is located in the area whose pincode is " +pincode);
	}
	
	public static void main(String[] args) {
		CompanyInfo ci=new CompanyInfo();
		ci.companyName(213);
		ci.companyName(125,"TCS");
		ci.companyName(752,"Wipro","Bangalore");
		ci.companyName(521, "Google", 600002);
	}
	
}





