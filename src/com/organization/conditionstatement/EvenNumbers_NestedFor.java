package com.organization.conditionstatement;

public class EvenNumbers_NestedFor {

	public static void main(String[] args) {
		for(int i=0;i<=10;i=i+2) {
			
			for(int j=0;j<=5;j++) {
				System.out.println("This is the value of j \t"+ j);
			}
			System.out.println("This is the value if i \t"+i);
		}
	}
	
}
