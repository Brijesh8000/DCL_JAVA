package com.dcl.example2;

public class Mobile extends ElectronicsDevice implements Camera, MusicPlayer {
     @Override
     public void clickPhoto() {
    	 System.out.println("Clicking photo with phone ");
    	 
     }
     
     @Override 
     public void playMusic() {
    	 System.out.println("Play music with phone");
    	 
     }
}
