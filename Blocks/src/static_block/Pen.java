package static_block;
/* Observing the Execution order while having multiple static blocks */
class Pen {
	 static
	{
		System.out.println("Insid the static block 1");
	}
	public static void main(String[] args) {
		System.out.println("Inside the main Method");
	}
	 static
		{
			System.out.println("Insid the static block 2");
		}
	 static
		{
			System.out.println("Insid the static block 3");
		}

}
