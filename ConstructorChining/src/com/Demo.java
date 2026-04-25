package com;

public class Demo {
	Demo(){
//		this(10);
		System.out.println(1);
		
	}
Demo(int a){
	this();
	System.out.println(2);
		
	}
public static void main(String[] args) {
	System.out.println("Starts");
	
//	Demo d=new Demo();
	Demo d=new Demo(10);
	
	System.out.println("End");

}

}
