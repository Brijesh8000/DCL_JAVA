package com.dcl;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Stsrt");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a ");
		int a=s.nextInt();
		
		System.out.println("Enter the b ");
		int b=s.nextInt()
;
		try {
			System.out.println(a/b);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Do no divide by 0 ");
		}
		
		System.out.println("END");

		
	}

}
