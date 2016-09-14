package Lab11;

public class ThreadMaker{
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		SimpleThread1 tm = new SimpleThread1( );
		SimpleThread1 tm1 = new SimpleThread1( );
		tm.start(); 
		tm1.start(); 
	}
}