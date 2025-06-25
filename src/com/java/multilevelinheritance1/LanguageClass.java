package com.java.multilevelinheritance1;

import com.java.multilevelinheritance4.Telugu;

public class LanguageClass extends Telugu {

	private void allLanguage() {
		System.out.println("Lists of all langusge");
	}
	
	public static void main(String[] args) {
		LanguageClass lc=new LanguageClass();
		lc.allLanguage();
		lc.englishLanguage();
		lc.tamilLanguage();
		lc.teluguLanguage();
	}
	
}
