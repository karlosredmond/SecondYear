package Lab10;

import java.io.*;

public class example1 {
	private static String name;
	private static BufferedReader in ;
	
	public static void init(){
		in = new BufferedReader(new InputStreamReader(System.in)) ;
	}
	public static void main(String[] args){
		init() ;
		System.out.println("Enter a String");
		try {
			name = in.readLine() ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name) ;
	}

}
