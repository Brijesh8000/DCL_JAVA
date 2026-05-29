package Generics;

import java.util.ArrayList;

public class StudentApp {
	public static void main(String[] args) {
		Student s1=new Student(101, "Brijesh");
		Student s2=new Student(102, "Ranjit");

		Student s3=new Student(103, "Rohit");

		Student s4=new Student(104, "Devraj");
		
		ArrayList<Student> sList=new ArrayList<Student>();
		
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(new Student(105, "Joseph Vinay yadav"));
		
		for(Student x:sList) {
			System.out.println(x.id + " " +x.name);
		}

		
	}

}
