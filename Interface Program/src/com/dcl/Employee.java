package com.dcl;

class Employee implements Person{
	public void eat() {
		System.out.println("Eating");
	}
	public static void main(String[] args) {
		System.out.println(Person.age);
		Employee e=new Employee();
		e.eat();
		
	}

}
