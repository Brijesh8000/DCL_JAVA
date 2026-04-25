package com;

class App {
	public static void main(String[] args) {
		CalculatorLogic c=new CalculatorLogic();
		
		System.out.println("Starts");
		System.out.println("***************");
		c.massage();
		
		c.add(50, 54);
		c.sub(10, 5);
		int multiplication =c.mul();
		int division=c.div();
		int modulus=c.mod();
		
		System.out.println("Multiplication is : "+multiplication);
		System.out.println("Division id : " +division);
		System.out.println("Modulous is : "+modulus);
		System.out.println("***************");
		System.out.println("Ends");
		
	}

}
