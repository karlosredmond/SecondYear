package Lab3a;

public class ThermTest
{ // begin class ThermTest
  public static void main(String args[]) 
  { // being main
    double tempB;				
    Thermometer thermA = new Thermometer();
    Thermometer thermB = new Thermometer(10.0);

    System.out.println("Temp. of Thermometer A is " + 
      thermA.getCelsius());
    thermA.setCelsius(20.0);
    System.out.println("Temp. of Thermometer A is " +     
       thermA.getCelsius());
    // assign return value of getCelsius to a variable
    tempB = thermB.getCelsius();
    System.out.println("Temp. of Thermometer B is " + tempB);				
    System.out.println("The temperature of ThermB in Fahrenheit is " + thermB.getFahrenheit()) ;
    System.out.println("Enter Fahrenheitof thermB " ) ;
    double poopy = Keyboard.readDouble() ;
    thermB.setFahrenheit(poopy) ;
    System.out.println("Temp of thermB in celc is " + thermB.getCelsius() + " fahrenheit: " + thermB.getFahrenheit()) ;
  
  } // end main
} // end class ThermTest
