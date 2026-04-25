package com.dcl.execution;

import com.dcl.logic.Office;
import com.dcl.objects.Developer;
import com.dcl.objects.HR;
import com.dcl.objects.Tester;



public class App {
	public static void main(String[] args) {
		Office f=new Office();
		
		Developer d=new Developer();
		HR hr=new HR();
		Tester t=new Tester();
		
		System.out.println("<-------Developer------->");
		f.hire(d);
		System.out.println("<-------HR------->");
		f.hire(hr);
		System.out.println("<-------Tester------>");
		f.hire(t);
		
		
	}
	

}
