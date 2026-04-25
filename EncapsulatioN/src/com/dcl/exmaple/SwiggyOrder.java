package com.dcl.exmaple;

public class SwiggyOrder {
	private int orderId;
	private String itemName;
	private String resturant;
	private String address;
	private double price;
	
	public void setOrderId(int orderId) {
		this.orderId=orderId;	
	}
	
	public void setItemName(String ItemName) {
		this.itemName=ItemName;	
	}
	public void setResturant(String resturent) {
		this.resturant=resturent;	
	}
	public void setAddress(String address) {
		this.address=address;	
	}
	public void setPrice(int price) {
		this.price=price;	
	}
	
	public int getOrderId() {
		return this.orderId;
	}
	public String getItemName() {
		return this.itemName;
	}
	public String getResturant() {
		return this.resturant;
	}
	public String getAddress() {
		return this.address;
	}
	public double getPrice() {
		return this.price;
	}
	

}
