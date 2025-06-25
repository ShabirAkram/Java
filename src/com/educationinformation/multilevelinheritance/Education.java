package com.educationinformation.multilevelinheritance;

public class Education extends Medicine {

	public void ug() {
		System.out.println("Under Graduation");
	}
	
	public void pg() {
		System.out.println("Post Graduation");
	}
	

	public static void main(String[] args) {
		Education e = new Education();
		e.ug();
		e.pg();
		e.bsc();
		e.bEd();
		e.bA();
		e.bBA();
		e.bE();
		e.bTech();
		e.physiyo();
		e.dental();
		e.mbbs();
	}
}
