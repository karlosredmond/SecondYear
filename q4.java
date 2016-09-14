/**
 * 
 */
package Lab6;

import javax.swing.*;

/**
 * @author Karl Redmond
 * Student No: C00196815
 *
 */
public class q4 {

	/**
	 * 
	 */
	public static String oddEven(int number){
		if(number % 2 == 0){
			return "Even";
		}
		else{
			return "Odd" ;
		}
		
	}
	public static void main(String[] args){

	  		int number = Integer.parseInt(JOptionPane.showInputDialog("Please Enter a Number"));
	  		String truth = oddEven(number) ;
	  		JOptionPane.showMessageDialog(null,"The number is " + truth,"My Message Box",1);
	  		
			System.exit(0);
	  	}


}
