package com.dcl.excution;

import java.util.Scanner;

import com.dcl.logic.Hotel;
import com.dcl.objects.Dosa;
import com.dcl.objects.Food;
import com.dcl.objects.Idly;
import com.dcl.objects.Vada;



public class App {
	public static void main(String[] args) {
		Hotel hotel =new Hotel();
		Scanner s=new Scanner(System.in);
		Food food;
		System.out.print("Select item : ");
		int choice =s.nextInt();
		    
		food=hotel.orderFood(choice);
		   
		if(food instanceof Idly) {
			Idly i=(Idly)food;
			System.out.println(food.type);
			System.out.println("Idly is Served");
			System.out.println("Idly Price is = " +i.idlyPrice);
		}
		else if( food instanceof Vada) {
			Vada v=(Vada)food;
			System.out.println(food.type);
			System.out.println("Vada is Served");
			System.out.println("Vada Price is =  "+v.davaPrice);
		}
		else if (food instanceof Dosa) {
			Dosa d=(Dosa)food;
			System.out.println(food.type);
			System.out.println("Dosa is Served ");
			System.out.println("Dosa Pricce = "+d.dosaPrice);
			
		}
		
	}

}
