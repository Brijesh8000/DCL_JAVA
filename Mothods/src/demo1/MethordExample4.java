package demo1;

class MethordExample4 {
	
	public int  multiply(int num) {
		
		int mul=num*num;
		
		return mul;

		
		
	}
	
	public String details(String name, String city) {
		return name +" belongs to " + city;
	}
	
	public static void main(String[] args) {
		
		MethordExample4 me4=new MethordExample4();
		int result=me4.multiply(5);
		System.out.println(result);
		
		System.out.println(me4.details("Brijesh", "Kolkata"));
		
				
		
	}

}
