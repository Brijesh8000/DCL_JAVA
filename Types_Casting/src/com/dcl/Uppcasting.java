package com.dcl;

public class Uppcasting {
	public static void main(String[] args) {
		// Upcasting 
		Father f=new Son();
		System.out.println(f.height);
//		System.out.println(f.age);
		
		// DownCasting
		
		Son s=(Son)f;
		
		System.out.println(s.height);
		System.out.println(s.age);
		
		
				
	}

}
