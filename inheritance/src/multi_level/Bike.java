package multi_level;

public class Bike extends Vehicle {
	int gear;
	
	public void changGear(int nextGear) {
		this.gear=nextGear;
		System.out.println("Gear : "+this.gear);
	}
	
	public void bikeDetails() {
		System.out.println("Brand : " +brand);
		System.out.println("Speed : "+speed);
	}

}
