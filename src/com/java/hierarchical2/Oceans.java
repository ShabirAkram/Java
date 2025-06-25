package com.java.hierarchical2;

import com.java.hierarchical1.Continents;

public class Oceans extends Continents {

	public void oceans() {
		System.out.println("Pacific Ocean, Atlantic Ocean, Indian Ocean, Arctic Ocean and the Southern Ocean");
	}
	
	public static void main(String[] args) {
		Oceans o=new Oceans();
		o.continents();
		o.oceans();
	}
}
