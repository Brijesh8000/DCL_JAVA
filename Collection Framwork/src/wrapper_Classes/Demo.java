package wrapper_Classes;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		// Auto-Boxing & Auto-UnBoxing 
		int w=10;
		Integer z=w;
		
		System.out.println(w);
		System.out.println(z);
		
		ArrayList al =new ArrayList();
		
		al.add(20);
		al.add(44.32);
		al.add("JAva");
		
		System.out.println(al);
		
	}

}
