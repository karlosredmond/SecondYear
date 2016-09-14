/** Author: GD          Date: September 2011
** Program that demonstrates the use of the Object class
** and the use of casts in Java
*/

package Lab10;
public class Objects
{
  public static void main(String args[])
  {
        Object myObject;        // a generic type (of type Object)
        String myString;        // myString is of type String

        myString = new String("I'm a string");

        // we can assign a String object to type Object without
        // casting, because through inheritance, all Strings are Objects!

        myObject = myString;

        // however, we cannot make the assignment in the other direction
        // (Object to String) without using a cast

        myString = (String) myObject;
        
        // This principle applies to all subclasses of Object, i.e.
        // String, Integer,Double, Float etc.
  }
}

