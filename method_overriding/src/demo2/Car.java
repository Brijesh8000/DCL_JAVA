package demo2;

public class Car extends Vehicle {
	@Override
	public void start() {
		System.out.println("Car is Satrting");
		super.start();
		
	}
	public void changeGear() {
		System.out.println("car is Changing Gear");
	}

}
