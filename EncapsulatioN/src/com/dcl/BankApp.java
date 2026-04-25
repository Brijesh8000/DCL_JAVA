package com.dcl;

public class BankApp {
	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.deposit(5000);
		System.out.println(b.getBalance());
		
	}

}
