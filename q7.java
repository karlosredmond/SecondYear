package Lab6;

import javax.swing.*;

public class q7 {
	

	public static String sum(int number, String operator,Integer number2){
		String timesTables = "";
		
		switch(operator){
		 	case "+":
		 		number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a second number"));
		 		return "The answer is " + (number + number2) ;
		 	case "-":
		 		number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a second number"));
		 		return "The answer is " + (number - number2);
		 	case "/" :
		 		number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a second number"));
		 		return "The answer is " + (number / number2) ;
		 	case "*":
		 		number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a second number"));
		 		return  "The answer is " + (number * number2);
		 	case "square":
			 	return "The answer is " + Math.pow(number, 2) ;
			case "cube":
			 	return "The answer is " + Math.pow(number,3);
			 case "inverse" :
			 	return  "The answer is " + (1 / number) ;
			 case "times":
				 for(int i = 1 ; i <= 10 ; i++){
					 timesTables = timesTables + "\n" + i + "x" + number + "=" + (i * number) ;
				 }
				 return "The " + number + " times tables" + timesTables;
			 default :
				return "" ;
		}
		
	}
	public static void main(String args[]){
		
		int number;
		Integer number2 = null;
		String option ;
		String answer ;
		
		String [] choices = {"square", "cube", "inverse","times","+","-","/","*" }  ;
		number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
		option = (String)JOptionPane.showInputDialog(null,"Please select an option","My Message Box",
		JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
		answer = sum(number,option, number2);
		JOptionPane.showMessageDialog(null, answer);
	}
}
