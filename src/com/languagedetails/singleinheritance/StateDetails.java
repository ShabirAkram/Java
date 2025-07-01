package com.languagedetails.singleinheritance;

public class StateDetails extends LanguageInfo {

	private void southindia() {
		System.out.println("Southern part of india");
	}
	
	private void northindia() {
		System.out.println("Northern part of india");
	}
	
	public static void main(String[] args) {
		StateDetails sd=new StateDetails();
		sd.tamilLanguage();
		sd.englishLanguage();
		sd.hindiLanguage();
		sd.southindia();
		sd.northindia();
	}
	
}
