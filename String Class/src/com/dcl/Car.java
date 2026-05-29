package com.dcl;

public class Car {
	public static void main(String[] args) {
		Car c2=new Car();
		Car c1=new Car();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.equals(c2));
	}

}
