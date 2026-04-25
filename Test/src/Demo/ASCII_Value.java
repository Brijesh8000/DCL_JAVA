package Demo;

public class ASCII_Value {
	String toggleCase(String s) {
	    StringBuilder sb = new StringBuilder();
	    for (char c : s.toCharArray()) {
	        if (c >= 'A' && c <= 'Z')      sb.append((char)(c + 32));
	        else if (c >= 'a' && c <= 'z') sb.append((char)(c - 32));
	        else sb.append(c);
	    }
	    return sb.toString();
	}
	public static void main(String[] args) {
		
		ASCII_Value s=new ASCII_Value();
		System.out.println(s.toggleCase("Brijesh shaw"));
//		long no=1234567890l;
//		String s=String.valueOf(no);
//		
//		String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		s=s+s1;
//		
//		for(char c:s.toCharArray()) {
//		    System.out.println("ASCII value of "+c+" is "+(int)c);
//		}
//		for(char c:s.toCharArray()) {
//		    System.out.println("Lower Case of "+c+" is "+(char)(c+32)+ " "+(int)(c+32));
//		}
//		
//		for (int i=0;i<=25;i++) {
//			System.out.println(i+"of "+(char)(i));
//			
//			System.out.println("ASCII of "+s1.charAt(i)+" is "+(int)(s1.charAt(i)));
//		}
//		System.out.println("ASCII value of  ₹ is "+(int)('₹'));
		
		
	}

}
