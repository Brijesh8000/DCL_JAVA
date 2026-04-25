package initializing_variable;

import java.util.Scanner;

/*  Initializing the non-static variables using a custom 
 * non parameterized Constructor */

 class Mobile {
	 String model;
	 String brand;
	 String color;
	 int prince;
	 
	 Mobile(String a,String b,String c,int d){
		 model=a;
		 brand=b;
		 color=c;
		 prince=d;
		 
	 }
	 public static void main(String[] args) {
		 
		 Mobile m=new Mobile("S23","Sumsung","white",50000);
		 System.out.println(m.model);
		 System.out.println(m.brand);
		 System.out.println(m.color);
		 System.out.println(m.prince);
		 
		 Mobile m2=new Mobile("2a","Nothing","white",20000);
		 System.out.println(m2.model);
		 System.out.println(m2.brand);
		 System.out.println(m2.color);
		 System.out.println(m2.prince);
		 
		 Scanner s1=new Scanner(System.in);
		 System.out.println("Enter the Model name : ");
		 String model=s1.next();
		 System.out.println("Enter the brand name : ");
		 String brand=s1.nextLine();
		 System.out.println("Enter the color : ");
		 String color=s1.next();
		 System.out.println("Enter the price : ");
		 int prince=s1.nextInt();
		 
		 
		 
		 
		
		
		 
		 
		 Mobile m3=new Mobile(model,brand,color,prince);
		 System.out.println(m3.model);
		 System.out.println(m3.brand);
		 System.out.println(m3.color);
		 System.out.println(m3.prince);
		 
		 s1.close();
	}
	 

}
