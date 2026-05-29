package com.dcl.checked_exception;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		int balance=10000;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Amount :");
		int amt=s.nextInt();
		if(amt<=balance) {
			System.out.println("Amount Withdrow");	
		}
		else {
			try {
				throw new InsufficientBalance();	
			}
			catch(InsufficientBalance r) {
				System.out.println("Insufficient Balance");	
			}
		}	
	}
}
