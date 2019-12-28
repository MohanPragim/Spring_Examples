package springobjectwith2_xmls;

public class Traveller {

	private Vehicle vehicle;

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void startJourney() {
		vehicle.start();
		vehicle.stop();

	}
}
