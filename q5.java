package Lab6;

import javax.swing.*;

public class q5 {
	
	public static double sum(int number, String operator){
		
		switch(operator){
		 	case "square":
		 		return Math.pow(number, 2) ;
		 	case "cube":
		 		return Math.pow(number,3);
		 	case "inverse" :
		 		return 1 / number ;
			default :
				return 0.0 ;
		}
		
	}

	public static void main(String args[]){
		
		String [] choices = {"square", "cube", "inverse" }  ;
		int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
		String option = (String)JOptionPane.showInputDialog(null,"Please select an option","My Message Box",
		JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
		double answer = sum(number,option) ;
		JOptionPane.showMessageDialog(null, "The answer is " + answer);
	}

}
