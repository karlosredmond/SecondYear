package Lab10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question1 {

	public question1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		try {
			System.out.println("Enter an Integer") ;
 			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String i = in.readLine() ;
			try{
				int num = Integer.parseInt(i) ;
				System.out.println("The number you entered was " +num) ;
				
			}
			catch(NumberFormatException e){
				System.out.println("Not a valid integer") ;
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
