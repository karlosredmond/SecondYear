package Lab3a;

public class Thermometer
{ // begin Thermometer
	private double celsius;	// more about private later
	// celsius is accessible to all methods in this class
	
	public Thermometer()		// constructor method #1
	{
		setCelsius(0);		
	}
		
	public Thermometer(double cel)	// constructor method #2
	{
		setCelsius(cel);
	}

	public void setCelsius(double cel)
	{
		celsius = cel;		
	}

	public double getCelsius()
	{
		return celsius;
	}
	public double getFahrenheit()
	{
		return ((celsius * 9) /5 +32);
	}
	public void setFahrenheit(double fahr)
	{
		celsius = (fahr-32) * 5 / 9;		
	}
} // end class Thermometer

