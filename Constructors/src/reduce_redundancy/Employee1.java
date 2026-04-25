package reduce_redundancy;

public class Employee1 {
	int id;
	String name;
	String email;
	int salary;
	
	Employee1(int id,String name,String email,int salary){
		
		this.id=id;
        this.name=name;
        this.email=email;
        this.salary=salary;
		  
	}
	
	void printDetails() {
		System.out.println("Employee Details of "+this.name);

		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.email);
		System.out.println(this.salary);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		Employee1 e1=new Employee1(102, "Tanmay", "tanmay@gmail.com", 20000);
		Employee1 e2=new Employee1(103, "Debu", "debu@gmail.com", 30000);
		
		e1.printDetails();
		e2.printDetails();

		
	}

}
