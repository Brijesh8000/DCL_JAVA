package com.dcl;

public class BankAccount {
	private double balance;
	
	public void deposit(double balance) {
		this.balance=balance;
	}
	
	public double getBalance() {
		return this.balance;
	}

}
