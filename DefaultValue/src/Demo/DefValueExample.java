package Demo;

class DefValueExample {
	
	// non-static varibles
	
	int a; //0
	double b;//0.0d
	long l=9223372036854775807l; // 9223372036854775807
	boolean c;//false
	char d;// NUL character or \u0000, Unicode value=0
	String name; //NULL
	public static void main(String[] args) {
		
		DefValueExample dev=new DefValueExample();
		
		System.out.println(dev.a);
		System.out.println(dev.l);
		System.out.println(dev.b);
		System.out.println(dev.c);
		System.out.println(dev.d);
		System.out.println(dev.name);
		
	}

}
