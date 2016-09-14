package Lab11;

public class SimpleThread1 extends Thread{ 
	public static int num;
	public SimpleThread1(){
		this("Thread Number "+ num++);
	}		
	public SimpleThread1( String name){
		super(name);
	}
	public void run(){
		System.out.println(this.getName()+" alive!"); 
	}
}