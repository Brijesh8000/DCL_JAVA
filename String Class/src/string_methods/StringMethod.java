package string_methods;

public class StringMethod {
	public static void main(String[] args) {
		String s1="Programming";
		String s2="programming";
		System.out.println("<------------------>");
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("<------------------>");
         System.out.println(s1.length());
 		System.out.println("<------------------>");

         System.out.println(s1.charAt(5));
 		System.out.println("<------------------>");

 		System.out.println(s1.startsWith("Pro"));
 		System.out.println(s1.endsWith("ing"));
		System.out.println("<------------------>");

 		System.out.println(s1.equals(s2));
 		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("<------------------>");
        System.out.println(s1.substring(3,7));
        System.out.println(s1.substring(2,8));
        System.out.println("<------------------>");
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(5));
		
	}

}
