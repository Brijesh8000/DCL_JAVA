package com.dcl.logic;

import com.dcl.objects.Developer;
import com.dcl.objects.Employee;
import com.dcl.objects.HR;
import com.dcl.objects.Tester;

public class Office {
	
	 public void hire(Employee e) {
		 if(e instanceof Developer) {
			 Developer d=(Developer)e;
			 System.out.println(e.company);
			 System.out.println("Hired as a Developer ");
			 System.out.println("Salary = "+d.devSalary);
		 }
		 else if(e instanceof HR) {
			 HR h=(HR)e;
			 System.out.println(h.company);
			 System.out.println("Hired as a HR ");
			 System.out.println("Salary = "+h.hrSalary);
		 }
		 else if(e instanceof Tester) {
			 Tester t=(Tester)e;
			 System.out.println(t.company);
			 System.out.println("Hired as a Tester ");
			 System.out.println("Salary = "+t.testerSalary);
		 }
		 
		 
	 }

}
