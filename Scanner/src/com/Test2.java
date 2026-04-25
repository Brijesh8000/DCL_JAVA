package com;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		System.out.println("Start");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter UserID");
		int id=sc.nextInt();
		System.out.println("Entr the User name : ");
		String name=sc.next();
		System.out.println("Enter the Salary ");
		double salary=sc.nextDouble();
		
		System.out.println("UserId is "+id +"\nUse Name "+name+"\nSalary is "+salary);
		System.out.println("Ends");
		
		sc.close();
	}

}
