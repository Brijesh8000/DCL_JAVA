package com.dcl.example3;

public class Country {
	public static void main(String[] args) {
		PrimeMinister minister=PrimeMinister.electPM();
		PrimeMinister.electPM();
		System.out.println("Elected PM id "+minister.name);
		System.out.println(minister.name+ " Is serving his " +minister.term+" term");
	}

}
