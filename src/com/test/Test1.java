package com.test;



public class Test1 {

	public static void main(String[] args) {
		
		String name1 ="GreensTechnology";
		String name2="SeleniumAutomationTool";
		String name3="velmurgan";
		String name4="j a v a p r o g r a m";
		String name5="9944152058";
		
		System.out.println("Length of String");
		System.out.println("======================");
		int length1 = name1.length();
		System.out.println(length1);
		int length2 = name2.length();
		System.out.println(length2);
		int length3 = name3.length();
		System.out.println(length3);
		int length4 = name4.length();
		System.out.println(length4);
		int length5 = name5.length();
		System.out.println(length5);
		
		System.out.println("index of String");
		System.out.println("======================");
		int lastIndexOf1 = name1.lastIndexOf('o');
		System.out.println(lastIndexOf1);
		int indexOf2 = name2.indexOf('o');
		System.out.println(indexOf2);
		int indexOf3 = name3.indexOf('n');
		System.out.println(indexOf3);
		int lastIndexOf4 = name4.lastIndexOf(' ');
		System.out.println(lastIndexOf4);
		int indexOf5 = name5.indexOf('8');
		System.out.println(indexOf5);
		
		System.out.println("Character from String");
		System.out.println("======================");
		char charAt1 = name1.charAt(9);
		System.out.println(charAt1);
		char charAt2 = name2.charAt(11);
		System.out.println(charAt2);
		char charAt3 = name3.charAt(4);
		System.out.println(charAt3);
		char charAt4 = name4.charAt(8);
		System.out.println(charAt4);
		
	}
	
}
