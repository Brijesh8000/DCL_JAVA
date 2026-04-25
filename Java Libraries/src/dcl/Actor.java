package dcl;

public class Actor {
	
	int age ;
	String name;
	String industry;
	
	Actor(int age,String name, String industry){
		this.age=age;
		this.name=name;
		this.industry=industry;
		
	}
	@Override
	public String toString() {
		return "Age= "+age+"Name : "+name+"Indructry = "+industry;
	}
	
	public static void main(String[] args) {
		Actor a1=new Actor(60,"Balaya","Tollywood");
		Actor a2=new Actor(52,"Salman","Wollywood");

		Actor a3=new Actor(40,"Yash","Tollywood");
		
		Actor[] a=new Actor[3];
		
		a[0]=a1;
		a[1]=a2;
		a[2]=a3;
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		

		
		
		
	}

}
