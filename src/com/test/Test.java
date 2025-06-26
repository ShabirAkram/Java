package com.test;

public class Test {

	public static void main(String[] args) {
		
		String name = " Shabir Akram";
		String name1 = " shabir akram";
		
		int length = name.length();
		System.out.println(length);
		
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);	
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		
		int indexOf = name.indexOf('S');
		System.out.println(indexOf);	
		int lastIndexOf = name.lastIndexOf('a');
		System.out.println(lastIndexOf);	
		char charAt = name.charAt(2);
		System.out.println(charAt);
		
		boolean equals = name.equals(name1);
		System.out.println(equals);		
		boolean equalsIgnoreCase = name.equalsIgnoreCase(name1);
		System.out.println(equalsIgnoreCase);
		
		boolean contains = name.contains(" Shabir Akram");
		System.out.println(contains);		
		String replace = name.replace(" Shabir Akram","Shabbar Hanzala");
		System.out.println(replace);
		
		boolean startsWith = name.startsWith(" Shabir");
		System.out.println(startsWith);		
		boolean endsWith = name.endsWith("Akram");
		System.out.println(endsWith);
		
		boolean empty = name.isEmpty();
		System.out.println(empty);
		
		String trim = name.trim();
		System.out.println(trim);
		
		String substring = name.substring(5);
		System.out.println(substring);		
		String substring2 = name.substring(5,7);
		System.out.println(substring2);
		
		
		System.out.println("Hi------------------");
	}
	
}
