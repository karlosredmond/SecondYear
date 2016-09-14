package Lab11;

public class ThreadedMain extends Thread{
	public ThreadedMain(){
		System.out.println(this.getName()+" alive!"); 
	}
	
	public static void main(String[] args){
		 System.out.println("Hello World!");
		 Thread t = new ThreadedMain();
		 t.start();
		 yield();
		 System.out.println("Goodbye from main");
	}
}
