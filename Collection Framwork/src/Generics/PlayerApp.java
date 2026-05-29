package Generics;

import java.util.ArrayList;

public class PlayerApp {
	public static void main(String[] args) {
		Player p1 =new Player("Rajat", "RCB", "India", "12 Cr");
		Player p2=new Player("Rajat", "RCB", "India", "12 Cr");

		Player p3=new Player("Rajat", "RCB", "India", "12 Cr");

		Player p4 =new Player("Rajat", "RCB", "India", "12 Cr");
		
		ArrayList<Player> p=new ArrayList<Player>()
;
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		
		for(Player s:p) {
			System.out.println(s);
		}
		
	}

}
