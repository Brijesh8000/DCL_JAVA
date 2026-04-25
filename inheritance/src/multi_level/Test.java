package multi_level;

public class Test {
	public static void main(String[] args) {
		ElectricBike ev=new ElectricBike();
		
		//Properties from Vehicle class
		System.out.println("Properties from Vehicle class");
		ev.start();
		ev.brand="OLA";
		ev.speed=120;
		
		System.out.println("<------------>");
		
		// Properties taken from Bike class
		System.out.println("Properties taken from Bike class");
		ev.changGear(2);
		ev.bikeDetails();
		System.out.println("<------------>");
		
		
		//Properties taken from electric Bike class
		System.out.println("Properties taken from electric Bike class");

		
		ev.battery=140;
		ev.electricBikeDetails();
		
		System.out.println("Properties taken from Vehile class");

		ev.stop();// vehicle
		
		
		
	}

}
