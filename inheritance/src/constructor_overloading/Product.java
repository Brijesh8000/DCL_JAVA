package constructor_overloading;

public class Product {
	
	Product(){
		System.out.println("Hello Constructor ");
		
	}
Product(int a){
	System.out.println(a);
		
	}
Product(double b){
	System.out.println(b);
	
}
Product(int a,String b){
	System.out.println(b+a);
	
}
Product(String a,int b){
	System.out.println(a+b);
	
}

public static void main(String[] args) {
	new Product();
	new Product(10);
	Product p=new Product(100.0);
	Product p1=new Product("Brijesh",100);
	Product p2=new Product(101,"Virat");
	
}

}
