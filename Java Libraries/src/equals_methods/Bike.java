package equals_methods;
// using Default implementation of equal() to compare two objects
public class Bike {
	String model;
	int price;
	
	public Bike(String model ,int price) {
		this.model=model;
		this.price=price;
	}
	
	public static void main(String[] args) {
		Bike b1=new Bike("R15",10000);
		Bike b2=new Bike("R15",20000);
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
	}

}
