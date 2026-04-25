package snippets;

public class Demo3 {
	
	int a=400; //global non static variable
	
	Demo3(){
		int a=300;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		Demo3 d3=new Demo3();
		
	}

}
