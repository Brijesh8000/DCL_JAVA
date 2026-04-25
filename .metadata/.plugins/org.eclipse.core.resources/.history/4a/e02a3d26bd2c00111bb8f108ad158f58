package com;

import java.util.Scanner;

public class CalculateAvgMarks {
	public static void main(String[] args) {
		double[] marks= new double[10];
		int n=marks.length,j=0;
		double sum=0;
		Scanner s=new Scanner(System.in);
		
		while(j!=n) {
			System.out.println("Enter the value at index "+j+": ");
			double d=s.nextDouble();
			marks[j]=d;
			j++;	
		}
		
		for(double i: marks) {
			sum=sum+i;		
		}
		double avg=sum/n;
		System.out.println("Average of Marks ="+avg);
	}

}
