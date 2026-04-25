package com.dcl.example;

public class AccountHolder implements HDFCBank
{   @Override
    public void withdraw() {
	System.out.println("Withdraw");
    	
    }
@Override
    public void deposit() {
	System.out.println("Deposited ");
    	
    }
}
