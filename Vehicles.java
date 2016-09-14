package Lab5;

public abstract class Vehicles {
	private int wheels;
	private int passengers;
	
	public Vehicles() {
		this(0,0) ;
	}
	public Vehicles(int wheels, int passengers) {
		
		setWheels(wheels);
		setPassengers(passengers);
	}


	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	public abstract String drive();
}
