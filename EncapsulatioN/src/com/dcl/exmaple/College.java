package com.dcl.exmaple;

public class College {
	private int id;
	private String name;
	private String university;
	private String principle;
	private double fee;
	
	public void setId(int id) {
		this.id=id;	
	}
	public void setName(String name) {
		this.name=name;	
	}
	public void setUniversity(String university) {
		this.university=university;	
	}
	public void setPrinciple(String principle) {
		this.principle=principle;	
	}
	public void setFee(double fee) {
		this.fee=fee;	
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getUniversity() {
		return this.university;
	}
	public String getPrinciple() {
		return this.principle;
	}
	public double getFee() {
		return this.fee;
	}

}
