package super_keyword;

public class Son extends Father{
	int age=20;
	
	public void printAge() {
		int age=10;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		super.printAge();
	}
	
	public static void main(String[] args) {
		Son s=new Son();
		
		s.printAge();
		
	}

}
