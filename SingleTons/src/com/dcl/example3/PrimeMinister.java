package com.dcl.example3;

public class PrimeMinister {
	String name="Modi";
	int term=3;
	private static PrimeMinister pm;
	private PrimeMinister() {
		System.out.println("PM elected ");
		
	}
	public static PrimeMinister electPM() {
		if(pm==null) {
			pm=new PrimeMinister()
;		}
		return pm;
	}

}
