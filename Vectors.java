package Lab10;

/** Author: GD          Date: September 2011
** Program that demonstrates
** 1. the basic use of a Vector
** 2. how to input data from the console
** 3. how to convert from a String type to an int
** 4. how to convert a primitive int to an Integer object
** 5. how to convert from a Integer object back to a primitive int
**
** For clarity, no exception handling code is used
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vectors
{
  public static void main(String args[]) throws java.io.IOException
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String temp;                        // for temporary input
    Vector myVector = new Vector();

    System.out.print("Enter an integer value: ");
    temp = in.readLine();               // input a String

    // convert the String to an integer value
    int i = Integer.parseInt(temp);

    // cannot add primitive int's to a Vector, so we
    // must convert it to an Integer object

    myVector.addElement(new Integer(i));  // inserted at index 0

    // now retrieve the Integer object from the Vector
    // note the use of the cast operator

    Integer myInt = (Integer) myVector.elementAt(0);

    // convert the Integer object back to a primitive int
    i = myInt.intValue();



  }
}
