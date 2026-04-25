package com;

 class App {
	 
	 public static void main(String[] args) {
		 MethodLogic ml=new MethodLogic();
		 System.out.println("Starts");
		 System.out.println("************");
		 ml.m1();
		 ml.m2(10, 20);
		 
		 String result=ml.m3();
		 
		 System.out.println(result);
		 double sub=ml.m4(11.2, 1.2);
		 
		 System.out.println(sub);
		 
		 System.out.println("************");
		 System.out.println("Ends");
		 
		
	}

}
