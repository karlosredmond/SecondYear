package Lab6;

import javax.swing.*;

public class q6 {
	

	public static double sum(int number, String operator,Integer number2){
		
		switch(operator){
		 	case "+":
		 		number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a second number"));
		 		return number + number2 ;
		 	case "-":
		 		number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a second number"));
		 		return number - number2;
		 	case "/" :
		 		number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a second number"));
		 		return number / number2 ;
		 	case "*":
		 		number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a second number"));
		 		return  number * number2;
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
		
		int number;
		Integer number2 = null;
		String option ;
		double answer ;
		
		
		String [] choices = {"square", "cube", "inverse","+","-","/","*" }  ;
		number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
		option = (String)JOptionPane.showInputDialog(null,"Please select an option","My Message Box",
		JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
		answer = sum(number,option, number2);
		
		JOptionPane.showMessageDialog(null, "The answer is " + answer);
	}

}

