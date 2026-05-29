package com.dcl;

public class Test {
	public static void main(String[] args) {
		
		// 1. Empty representation of String object
		String s1=new String(); //Similar to String s1="";
		System.out.println(s1);
		System.out.println("<-------------->");
		// 2.Constructor Accepted Sequence of Char*
		String s2=new String();
		System.out.println(s2);
		
		// 3. Passing char[] in the constructor parameter
		// which will be converted into String
		System.out.println("<-------------->");
		 char[] c= {'J','A','V','A'};
		 
			String s3=new String(c);
			System.out.println(s3);



		
	}

}
