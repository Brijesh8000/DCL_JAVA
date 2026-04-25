package demo;

public class Runner {
	static int a=10;
	static {
		System.out.println(a);
		a=25;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Runner runner=new Runner();
		System.out.println(a);
		a=100;
		System.out.println(a);
		
	}
	{
		System.out.println(a);
		a=50;
		System.err.println(a);
	}

}//10 , 25 ,25,50,50,100;
