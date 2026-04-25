package com.dcl.exmaple;

public class CollegeApp {
	public static void main(String[] args) {
		College c=new College();
		c.setId(1000);
		c.setName("jadavpur University");
		c.setPrinciple("BKD");
		c.setUniversity("JU");
		c.setFee(20000.0);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getUniversity());
		System.out.println(c.getPrinciple());
		System.out.println(c.getFee());
		
	}

}
