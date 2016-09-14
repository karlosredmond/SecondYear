package Lab11;

public class ThreadTester{
	static public void main(String[] args){
		CountThread thread1 = new CountThread(1, 10);
		CountThread thread2 = new CountThread(20, 30);
		thread1.start();
		thread2.start();
	}
}
