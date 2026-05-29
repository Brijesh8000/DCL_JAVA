package com.dcl.checked_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			FileReader fr=new FileReader("demo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
           System.out.println(e.getMessage());	
           System.out.println("End");
           }
	}

}
