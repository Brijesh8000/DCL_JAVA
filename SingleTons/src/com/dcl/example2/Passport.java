package com.dcl.example2;

public class Passport {
	private static Passport obj;
	private  Passport() {
		System.out.println("Passport object Created ");
		
	}
	public static void createPassportObject() {
		if(obj==null) {
			obj=new Passport();
		}
		else {
			System.out.println("Passpot not created");
		}
	}

}
