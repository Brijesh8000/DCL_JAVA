package com.dcl.exmaple;

public class SwiggyApp {
	public static void main(String[] args) {
		SwiggyOrder s=new SwiggyOrder();
		s.setOrderId(101);
		s.setItemName("Cold Cofee");
		s.setResturant("Swish");
		s.setAddress("BTM 4th Main Road");
		s.setPrice(399);
		
		System.out.println("Order ID "+s.getOrderId());
		System.out.println("Item name "+s.getItemName());
		System.out.println("Resturent "+ s.getResturant());
		System.out.println("Address "+ s.getAddress());
		System.out.println("Price "+s.getPrice());
		
		
		SwiggyOrder s1=new SwiggyOrder();
		s1.setOrderId(102);
		s1.setItemName("Pizza");
		s1.setResturant("Swish");
		s1.setAddress("BTM 4th Main Road");
		s1.setPrice(499);
		
		System.out.println("<-------------------------->");
		System.out.println("Order ID "+s1.getOrderId());
		System.out.println("Item name "+s1.getItemName());
		System.out.println("Resturent "+ s1.getResturant());
		System.out.println("Address "+ s1.getAddress());
		System.out.println("Price "+s1.getPrice());
		
	}

}
