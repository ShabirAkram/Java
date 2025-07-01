package com.java.hierarchical1;

public class Country extends Continents {

	public void country() {
		System.out.println("There are 195 countries in the world");
	}
	
	public static void main(String[] args) {
		Country c=new Country();
		c.continents();
		c.country();
	}
}
