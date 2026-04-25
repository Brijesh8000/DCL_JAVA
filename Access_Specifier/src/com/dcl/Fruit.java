package com.dcl;
// Accessing protected member in the same class

public class Fruit {
	protected int price=2000;
	
	protected Fruit(){
		System.out.println("Inside the fruit constructor");
		
	}
	
	protected void sell() {
		System.out.println("5 kg of fruits are sell");
	}
	
	public static void main(String[] args) {
		Fruit f=new Fruit();
		System.out.println(f.price);
		f.sell();
		
	}
	

}
