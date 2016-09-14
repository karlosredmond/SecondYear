package Lab5;

public class Car extends RoadVehicle
{
	private String carType;

	public Car()
	{ 	 }

	public Car(String c, int w, int p)
	{ 
		super(w, p);
		setType(c);
	}

	public void setType(String t)
	{
		carType = t;
	}

	public String getType()
	{
		return carType;
	}
}

