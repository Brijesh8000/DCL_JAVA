package dcl;

public class Employee {
	int id;
	String name;
	String desc;
	double salary;
	Employee(int id,String name,String desc,double salary){
		this.id=id;
		this.name=name;
		this.desc=desc;
		this.salary=salary;
				
		
		
	}
	@Override
	public String toString() {
		return "id :"+ id+" name: "+name+ " desc "+desc+ " salary "+salary;
		
	}
	public static void main(String[] args) {
		Employee e=new Employee(100,"Rohit ","Java Developer",200000);
		Employee e2=new Employee(101,"Ranjit ","Python Developer",250000);

		Employee e3=new Employee(102,"Devraj ","Java Programmer",100000);

//		Employee e=new Employee(100,"Rohit ","Java Developer",200000);
		
		System.out.println(e);
		System.out.println(e3);

		System.out.println(e2);


		
		
		
		
		
		
		
		
	}

}
