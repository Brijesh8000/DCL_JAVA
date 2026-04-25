package com.dcl.logic;

import com.dcl.objects.Dosa;
import com.dcl.objects.Food;
import com.dcl.objects.Idly;
import com.dcl.objects.Vada;

public class Hotel {
	public Food orderFood(int choice) {
		if(choice==1) {
			Idly i=new Idly();
			return i;
		}
		else if(choice==2) {
			Dosa d=new Dosa();
			return d;
		}
		else if(choice==3) {
			Vada v=new Vada();
			return v;
		}
		else {
			return null;
		}
	}

}
