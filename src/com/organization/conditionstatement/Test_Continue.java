package com.organization.conditionstatement;

public class Test_Continue {

	public static void main(String[] args) {
		
		for(int i=10;i<=15;i++) {
			if(i==12) {
				continue;
			}
			System.out.println(i);
		}
	}
	
}
