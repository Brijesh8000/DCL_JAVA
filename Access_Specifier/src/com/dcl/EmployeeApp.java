package com.dcl;

// Accessing default (No keyword ) members in a different class
// present in a different package
// which is not possible as it will not visible from other package 

import com.dcl.demo.Employee1;

public class EmployeeApp {
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.study();
		
		Employee1 e2=new Employee1();
		e2.study();
		System.out.println(e2.id);
		
		
		
	}

}
