package com.dcl.customException;

public class InvalidAgeExceotion  extends RuntimeException{
	private String message;
	public InvalidAgeExceotion(String message) {
		this.message=message;
		
	}
	@Override
	public String getMessage() {
		return message;
	}

}
