package com.dcl.customException;

import java.util.Scanner;

public class MetrimonialApp {
	public static void main(String[] args) {
		System.out.println("Start");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Age : ");
		int age=s.nextInt();
		if(age>=21) {
			System.out.println("Go for marrig ");
		}
		else {
			try {
				throw new InvalidAgeExceotion("Keep patience");
				
			}
			catch(InvalidAgeExceotion e) {
				System.out.println(e.getMessage());
				
			}
		}
		System.out.println("End");
		
		
	} 
	

}
