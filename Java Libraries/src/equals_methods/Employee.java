package equals_methods;

public class Employee {
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name=name;
		this.salary=salary;
		
	}
	public boolean equals(Object obj) {
		Employee downCastedObj=(Employee)obj;
		return this.name==downCastedObj.name && this.salary==downCastedObj.salary;
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Brijesh",200000);
		Employee e2=new Employee("Brijesh",200000);
		
		
		
		System.out.println(e1.equals(e2));
		System.out.println(new Employee("Scott", 10000).equals(new Employee("David", 12000)));
		
	}

}
