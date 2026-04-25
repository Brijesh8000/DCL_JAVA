package compiletime;

public class App {
	public static void main(String[] args) {
		Product p=new Product();
		p.buy();
		p.buy(100);
		p.buy("Book");
		p.buy("Book ",350);
		
	}

}
