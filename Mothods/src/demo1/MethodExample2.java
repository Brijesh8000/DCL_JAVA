package demo1;

 class MethodExample2 {
	 
	 /*  Method with argument, without return statement .*/
	 
	 public void add(int a ,int b) {
		 int sum =a+b;
		 System.err.println("The sum of "+ a +" and "+ b +" is "+sum );
	 }
	 
	 public static void main(String[] args) {
		 
		 MethodExample2 me=new MethodExample2();
		 me.add(10, 20);
		 
		
	}
	 
	 

}
