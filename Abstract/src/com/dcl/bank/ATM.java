package com.dcl.bank;

public class ATM implements Bank {
	int balance=10000;
	@Override
	public void deposite(int amt) {
		System.out.println("Amount Deposited : "+amt);
		balance=balance+amt;
		System.out.println("Amount deposite Succesfully");
		System.out.println("-------------------------");
		
	}
	@Override
	
	public void withdraw(int amt) {
		System.out.println("Amount Withdraw: "+amt);
		balance=balance-amt;
		System.out.println("Amount Withdrow Succesfully");
		System.out.println("-------------------------");
		
	}
	@Override
	
	public void checkBalence() {
		System.out.println("BAlance is "+balance);
		
		
	}
	

}
