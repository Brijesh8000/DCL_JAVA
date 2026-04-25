package compiletime;

public class Product {
	public void buy() {
		System.out.println("Pruduct purchased");
	}
	public void buy(int a) {
		System.out.println("Product Price "+a);
	}
	public void buy(String name) {
		System.out.println("Product name "+name);
	}
	public void buy(String name, int a) {
		System.out.println("Paid "+a+" for "+name);
	}

}
