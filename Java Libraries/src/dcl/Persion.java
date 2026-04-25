package dcl;

public class Persion {
	public static void main(String[] args) {
		Persion p =new Persion();
		Persion p2 =new Persion();
		
		System.out.println(p); // -> implicitly call of toString 
		System.out.println(p.toString()); 
		
		System.out.println(p2); // -> implicitly call of toString
		System.out.println(p2.toString());
		
	}

}
