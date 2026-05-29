package com.dcl.example1;

public class Adhar {
	private static Adhar obj=null;
	private Adhar() {
		System.out.println("Object Created ");
	}
	
	public static void createAdharObject() {
		if(obj==null) {
			obj=new Adhar();
		}
		else {
			System.out.println("No Object created");
		}
	}

}
