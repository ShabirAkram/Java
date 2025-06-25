package com.educationinformation.polyoverriding;

public class Arts extends Education {

	public void bSc(String name) {
		System.out.println("Bachelor of Science");
	}
	
	public void bEd() {
		System.out.println("Bachelor of Education");
	}
	
	public void bA() {
		System.out.println("Bachelor of Arts");
	}
	
	public void bBA(){
		System.out.println("Bachelor of Business Administration");
	}
	
	@Override
	public void ug(String name) {
		super.ug(name);
	}
	
	@Override
	public void pg(String name) {
		super.pg(name);
	}
	
	public static void main(String[] args) {
		Arts a=new Arts();
		a.bEd();
		a.bA();
		a.bBA();
		a.ug("UnderGraduate course");
		a.pg("PostGraduate course");
	}
	
}





