package com;

public class MethodLogic {
	/* Method without arguments , without return statements */
	
	public void m1() {
		System.out.println("Learning Java");
	}
	
	
	/* Method with arguments , without return statements */
	
	public void m2(int a,int b) {
		int sum =a+b;
		System.out.println("Sum is "+ sum);
	}

	/* Method without arguments , with return statements */
	
	public String m3() {
		return "Welcome to the Dhee Coding lab";
	}
	
	

	/* Method with arguments , with return statements */
	
	public double m4(double a, double b) {
		double sub=a-b;
		return sub;
	}


}
