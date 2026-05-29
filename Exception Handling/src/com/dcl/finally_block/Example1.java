package com.dcl.finally_block;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("Connection Built");
		
		try {
			System.out.println(30/0);
			
		}
		catch(NullPointerException e) {
			System.out.println("NULL PPOINTER EXep");
			
			
		}
		finally {
			System.out.println("Connection close");
		}
	}

}
