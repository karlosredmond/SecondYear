package Lab11;

public class ThreadMaker1{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Thread tm = new SimpleThread1( );
		Thread tm1 = new SimpleThread1( );
		tm.start(); 
		tm1.start(); 
	}
}
