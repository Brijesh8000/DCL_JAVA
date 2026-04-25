package reduce_redundancy;

public class Employee {
	int id;
	String name;
	String email;
	int salary;
	
	Employee(int id,String name,String email,int salary){
        this.id=id;
        this.name=name;
        this.email=email;
        this.salary=salary;
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(101, "Brijesh", "brijesh@gmail.com", 10000000);
		Employee e2=new Employee(102, "Debu", "debu@gmail.com", 20000000);
        
		System.out.println("Employee Details E1");
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.email);
		System.out.println(e1.salary);
		
		System.out.println();
		System.out.println("Employee Details E1");
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.email);
		System.out.println(e2.salary);

	}

}
