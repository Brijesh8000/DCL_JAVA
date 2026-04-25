package com.dcl;



public class Demo {
	public static void main(String[] args) {
		
		System.out.println("<--------wadennig------>");
		
		byte a=5;
		float b=5;
		System.out.println(a);
		System.out.println(b);
		int c=10;
		double d=c;
		System.out.println(c);
        System.out.println(d);
        
		System.out.println("<--------Special case char------>");
		
		byte e=65;
		char f=(char)e;
		System.out.println(e);
		System.out.println(f);
		
		
		System.out.println("<--------Narrowing------>");
		
		double g=96.3;
		int h=(int)g;
		
		System.out.println(g);
		System.out.println(h);
		
		double i=15.6;
		float j=(float)i;
//		System.out.println("Type of j "+typeOf(j));

		
		System.out.println(i);
		System.out.println(j);
		
		long k=1854889776592887962l;
		System.out.println(k);
		
		/* float dataType :- by default decimal value treated as
		 *                   double type in java 
		 so , we need to cast in float in either of the 3 following 
		 *  */
		float n=54.5f;
		float m=65.2f;
		float o=(float)78.2;
		
		System.out.println(n+" "+m+" "+o);
		
		
		
		


        
        
	}

}
