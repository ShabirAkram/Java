package com.computer.singleinheritance;

public class Desktop extends Computer {

	public void desktopsize() {
		System.out.println("height . 44” (1.13 cm), width 11.97” (30.41 cm), depth 8.46” (21.5 cm), and weighs 2.73 lb (1.24 kg)");	
	}
	
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopsize();
	}
	
}
