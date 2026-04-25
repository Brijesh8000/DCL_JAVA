package super_keyword;

public class Father extends Grandfather {
	int age =50;
	
	public void printAge(){
		age=super.age;
		System.out.println(age);
		
	}

}
