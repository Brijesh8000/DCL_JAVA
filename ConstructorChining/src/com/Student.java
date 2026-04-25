package com;

public class Student {
	
	Student(int age){
		this("Brijesh");
		System.out.println("Age : "+age);
		
		
	}

Student(String name){
	System.out.println("Name : "+name);
	
}
Student(double height){
	this(20);
	System.out.println("Height : "+height);
	
	
}

public static void main(String[] args) {
	System.out.println("Starts");
	Student s=new Student(5.8);
	System.out.println("End");

	
}


}
