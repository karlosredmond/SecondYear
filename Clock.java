package Lab3a;

public class Clock {

	public Clock() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time time = new Time(16,27,0) ;
		while(time.getSecond() < 13)
		{
	        long wait = System.currentTimeMillis() + 1000;
	        // wait for a second...
	        while (System.currentTimeMillis() < wait);
	        // move the current time on by one second
	        time.tick();
	        System.out.println(time.toString());
	        
		}
	}



}
