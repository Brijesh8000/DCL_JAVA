package com.dcl;

public class Example2 {
	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		
		String s3=new String();
		String s4=new String();
		
		// String Objects created  as a literal are created in SCP
		// as one single copy
		// Multiple ref can point to them
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);


;
		
	}

}
