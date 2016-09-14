package Lab8;

public class MyMain {

		   public static void main (String args[]) 
		{
		   int[] myArray = new int[10]; 
		   try 
		   {
		         System.out.println("Before valid array assignment");
		         myArray[0] = 1;
		         System.out.println("Before invalid array assignment");
		         myArray[100] = 1;
		         // statement below not executed!
		         System.out.println("After array exception");
		   }
		   catch(ArrayIndexOutOfBoundsException e) 
		   {
		         System.out.println("An array index error has occured");
		   }
		}
		} 
