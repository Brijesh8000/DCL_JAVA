package initializing_variable;
/*  Initializing the non-static variables using a custom 
 * non parameterized Constructor */
 class Television {
	 String model;
	 String brand;
	 String color;
	 int prince;
	 
	 Television(){
		 model="Bravia";
		 brand="Sony";
		 color="Black";
		 prince=55000;
		 
	 }
	 public static void main(String[] args) {
		 Television t=new Television();
		 System.out.println(t.model);
		 System.out.println(t.brand);
		 System.out.println(t.color);
		 System.out.println(t.prince);
		

		
	}

}
