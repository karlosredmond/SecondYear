package Lab11;

public class RunnableMain extends Thread{
	
	public RunnableMain(){
		System.out.println(this.getName()+" alive!"); 
	}
	
	public static void main(String[] args){
		 System.out.println("Hello World!");
		 Thread t = new Thread(new RunnableMain());
		 t.start();
		 yield();
		 System.out.println("Goodbye from main");
	}
}

