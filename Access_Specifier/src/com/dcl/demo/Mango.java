package com.dcl.demo;
// Accessing protected members from Fruit(parent class)
// via IS-A relationship 

import com.dcl.Fruit;

public class Mango extends Fruit

{
	public static void main(String[] args) {
		Mango m=new Mango();
		System.out.println(m.price);
		m.sell();
		
		
	}
	

}
