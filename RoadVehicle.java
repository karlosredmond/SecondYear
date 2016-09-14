package Lab5;

public class RoadVehicle {
	private int wheels;
	private int passengers;

	public RoadVehicle()
	{ 	this(0,0);	}

	public RoadVehicle(int w, int p)
	{ 
		setWheels(w);
		setPass(p);
	}

	public void setWheels(int num)
	{
		wheels = num;
	}

	public int getWheels()
	{
		return wheels;
	}

	public void setPass(int num)
	{
		passengers = num;
	}

	public int getPass()
	{
		return passengers;
	}

}
