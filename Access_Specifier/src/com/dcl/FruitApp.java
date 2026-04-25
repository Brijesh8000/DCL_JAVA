package com.dcl;
// Accessing protected members in a different class
//in the same package
public class FruitApp {
	public static void main(String[] args) {
		Fruit f=new Fruit();
		
		System.out.println(f.price);
		f.sell();
	}
	

}
