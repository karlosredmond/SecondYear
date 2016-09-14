package Lab8;

public class ExceptionTest
{
	public static void main (String args[]) 
	{
		int[] myArray = new int[10]; 
		try {
			myArray[100] = 1;
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			e = new ArrayIndexOutOfBoundsException("Please ensure your array index is within bounds.");
			throw(e); 
		}
	}
} 

