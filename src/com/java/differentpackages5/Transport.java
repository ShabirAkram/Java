package com.java.differentpackages5;

import com.java.differentpackages4.Road;
import com.java.differentpackages3.Air;
import com.java.differentpackages6.Water;

public class Transport {

	private void TransportForm() {
		System.out.println("Road,Air,Water");
	}
	
	public static void main(String[] args) {
		Transport t=new Transport();
		t.TransportForm();
		
		Road r=new Road();
		r.bike();
		r.cycle();
		r.bus();
		r.car();
		
		Air a=new Air();
		a.aeroPlane();
		a.heliCopter();
		
		Water w=new Water();
		w.boat();
		w.Ship();
		
	}
}
