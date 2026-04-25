package demo1;

public class MethodsExample {
	
	public void test() {
		System.out.println("Learning Methods");
	}
	
	public static void main(String[] arg) {
		System.out.println("Starts");
		System.out.println("----------");
		
		MethodsExample me=new MethodsExample();
		
		me.test();
		
		System.out.println("----------");
		System.out.println("Ends");
		
	}

}
