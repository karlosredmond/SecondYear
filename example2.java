package Lab10;

import java.io.*;

public class example2 {
	private static int number;
	private static BufferedReader in ;
	
	public static void init(){
		in = new BufferedReader(new InputStreamReader(System.in)) ;
	}
	public static void main(String[] args){
		init() ;
		String s = "";
		System.out.println("Enter a number");
		try {
			s = in.readLine();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Not a valid integer") ;
		}
		try{
			number = Integer.parseInt(s) ;
		}
		catch(NumberFormatException e){
			System.out.println("Not a valid integer") ;
		}
		


}
}