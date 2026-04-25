package custom;
/* Custom parameterized Constructor*/

public class Truck {
	Truck(String des){
		System.out.println("Truck will reach will "+des);
		
	}
	
	public static void main(String[] args) {
		Truck t=new Truck("Kolkata");
		Truck t2=new Truck("Bengalore");
		
	}
	

}
