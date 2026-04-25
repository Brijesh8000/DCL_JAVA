package com.dcl.exmaple3;

public class Employee extends Persion {
	@Override
	void work() {
		System.out.println("Working ");
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.work();
		
	}

}
