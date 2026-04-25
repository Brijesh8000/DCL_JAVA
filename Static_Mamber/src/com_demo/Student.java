package com_demo;

public class Student {
	/*Demonstration why static members should be not be accessed using the object reference 
	 * but should be always access sing className p*/
	static int a=10;
	public static void main(String[] args) {
		Student s1=new Student();
       System.out.println(s1.a);
       s1.a=20;
       System.out.println(s1.a);
       Student s2=new Student();
       System.out.println(s2.a);
}

}
