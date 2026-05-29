package hashCOde_methods;

public class User {
	public static void main(String[] args) {
		User u1=new User();
		int hash=u1.hashCode();
		System.out.println("Hashcode value of u1 : "+hash);
		
		//toString()
		System.out.println("To String code "+u1.toString());
		
		//Printing the Content of toString() out separately
		
		System.out.println("Fully Qualified Class Name : "+u1.getClass().getName());
		System.out.println("HexaDecimal form of HashCode : "+Integer.toHexString(hash));
	}

}
