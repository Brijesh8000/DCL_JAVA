package static_block;


/* initialization of static variable inside the static block */
class Test {
	static int a;
	static {
		a=20;
		System.out.println("Inside the static block "+a);
	}
	public static void main(String[] args) {
		System.out.println("Inside the main method");
	}

}
