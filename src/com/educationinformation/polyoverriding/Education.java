package com.educationinformation.polyoverriding;

public class Education {

	public void ug(String name) {
		System.out.println("He is studying ug course- " + name);
	}
	
	public void pg(String name) {
		System.out.println("He is studying pg course- " + name);
	}
	
	public static void main(String[] args) {
		Education e=new Education();
		e.ug("B.E Computer Science Engineering");
		e.pg("M.E Computer Science Engineering");
	}
	
}
