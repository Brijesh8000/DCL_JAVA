package com.dcl.customException;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String username="Smith";
		int password=123;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the User Name : ");
		String u=s.next();
		if(u.equals(username)) {
			System.out.println("Enter the Password :");
			int p=s.nextInt();
			if(p==password) {
				System.out.println("User Login");
			}
			else {
				try {
					 throw new InvalidPasswordException();
					
				}
				catch(InvalidPasswordException e) {
					System.err.println("Invalid Password ");
				}
			}
		}
		else {
			try {
				InvalidUserNameException e1=new InvalidUserNameException();
				throw e1;
				
			}
			catch(InvalidUserNameException e) {
				System.err.println("Invalid User Name ");
			}
		}
		
	}

}
