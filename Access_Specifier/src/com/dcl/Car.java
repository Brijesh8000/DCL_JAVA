package com.dcl;
 // Accessing private member in the same class 
public class Car {
	private String brand ="BMW";
	
	private Car() {
		System.out.println("Inside the car Constructor");
	}
	private void start() {
		System.out.println("Car Started ");
	}
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.brand);
		c.start();
	}

}
