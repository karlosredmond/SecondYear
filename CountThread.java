package Lab11;

public class CountThread extends Thread{
	private int start;
	private int finish;	

	public CountThread(int from, int to){
		this.start = from;
		this.finish = to;
	}
	public void run(){
		System.out.println(this.getName()+ " started executing...");
		for (int i = start; i <= finish; i++){
			System.out.print (i + " ");
		} 
		System.out.println(this.getName() + " finished executing.");
	} 
}
