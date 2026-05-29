package Generics;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<String> al =new ArrayList<String>();
		
		al.add("HTML");
		al.add("Java");
		al.add("CSS");
		al.add("Spring");
		
		System.out.println("------Using For each Loop -----");

		
		for(String x:al) {
			System.out.println(x);
		}
		System.out.println("------Using For Loop-------");

		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}

}
