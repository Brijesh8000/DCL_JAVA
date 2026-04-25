package com.dcl;

public class App3 {
	public static void main(String[] args) {
		Father f;
		f=new Son();
		
		if(f instanceof Son) {
			System.out.println("DownCanting to son");
             Son s=(Son)f;
			System.out.println("Age of Father "+s.fatherAge);
			System.out.println("Age of Son "+s.sonAge);

			

		}else if(f instanceof Daughter) {
			System.out.println("DownCanting to Dauthter");
            Daughter d=(Daughter)f;
			System.out.println("Age of Father "+d.fatherAge);
			System.out.println("Age of Son "+d.daughterAge);
			
		}
		
	}

}
