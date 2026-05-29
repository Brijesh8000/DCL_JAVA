package list.arraylis;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Java");
		al.add(10.5);
		al.add(100);
		al.add('A');
		al.add(null);
		al.add(30);
		al.add(30);
		
		System.out.println("---------------");
		System.out.println(al);
		System.out.println("---------------");
		System.out.println(al.size());
		System.out.println("---------------");
		System.out.println(al.get(2));
		System.out.println("---------------");
		System.out.println(al.contains(10));
		System.out.println("---------------");
		System.out.println(al.contains("java"));
		System.out.println("---------------");
		System.out.println(al.contains("Java"));
		System.out.println("---------------");
		al.remove(3);
		System.out.println(al);
		System.out.println("---------------");
		System.out.println(al.indexOf(30));
		System.out.println("---------------");
		System.out.println(al.lastIndexOf(30));
		System.out.println("---------------");
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println("---------------");
		System.out.println(al.isEmpty());
//		System.out.println();
		System.out.println("---------------");
		
		
		
		
		
		
		
	}

}
