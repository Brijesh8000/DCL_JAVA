package non_static_block;
/* Observing the Execution order while having multiple non static blocks*/ 
public class Pencil {
	{
		System.out.println("Inside the Non Static Block 1");
	}
	{
		System.out.println("Inside the non static block 2");
	}
	public static void main(String[] args) {
		Pencil p1=new Pencil();
		System.out.println("inside the main Method");
		Pencil p=new Pencil();
		
	}
	

}
