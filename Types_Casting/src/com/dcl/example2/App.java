package com.dcl.example2;

public class App {
	public static void main(String[] args) {
		// Upcastion 
		Vehicle v= new Car();
		System.out.println(v.brand);
		v.start();
//		System.out.println(v.model); //not possible
		
		//Downcasting 
		
		Car c=(Car)v;
		System.out.println("After Down casting ");
		
		System.out.println(c.brand);
		System.out.println(c.model);
		c.start();
		c.stop();
	}

}
