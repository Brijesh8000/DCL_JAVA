package com.dcl.example2;

public class App {
	
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.powerOn();// inherit from ElectonicsDevice
		m.clickPhoto();// From Camera
		m.playMusic();// from Music
		m.powerOff();// inherit from ElectonicsDevice
	}

}
