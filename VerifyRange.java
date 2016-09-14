package Lab8;


public class VerifyRange 
{
	MyOutOfRangeException e;
	public void verifyIntRange (int value, int low, int high) 
		throws MyOutOfRangeException 
	{
		if ((value < low) || (value > high)) 
		{
			e = new MyOutOfRangeException("number " + value + " 				out of range");
			throw(e); 
		}
	}

	}

 
