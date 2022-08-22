package Automation;

public class Internalbookings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		VehicleTM VehicleTMObject = new VehicleTM();
		Boomvehicle Boomvehicleobject =new Boomvehicle();
		Gangvehicle Gangvehicleobject =new Gangvehicle();
		
		VehicleTMObject.Mixter();
		Boomvehicleobject.carriage();
		Gangvehicleobject.motor();
	
		System.out.println("Internal Automated bookings done three type of Vehicles");
	}

}
