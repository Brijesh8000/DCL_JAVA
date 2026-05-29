package throws_keyword;

public class Demo1 {
	static void print() throws ArithmeticException {
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		
		try {
			print();
			
		} catch (ArithmeticException e) {
		      System.out.println("Invalid Denominator");
		}
		
		System.out.println("End");
		
	}

}
