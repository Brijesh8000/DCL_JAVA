package list.vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


public class Constroctor_Example {
	public static void main(String[] args) {
//		Integer a=10;
		ArrayList al=new ArrayList();
		al.add(10);
		
		al.add(20);
		
		LinkedList l=new LinkedList(al);
		l.add(30);
		l.add(40);
		
		Vector v=new Vector(l);
		v.add(50);
		v.add(60);
		
		System.out.println(v);
		
	}

}
