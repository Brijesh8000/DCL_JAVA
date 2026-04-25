package demo;
//output
//15
//100
//50
//30


public class Runner2 {/*  Value Re-initialisation - 10->25->15->100->50->40->30*/
	static int a=10;
	static {
		a=25;
		
	}
	
	static {
		a=15;
		System.out.println(a);
	}
	{
		a=50;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		a=100;
		System.out.println(a);
		Runner2 runner=new Runner2();
		
		System.out.println(a);
		
		
		
	}
	{
		
		a=40;
		
	}
	{
		a=30;
	}

}
