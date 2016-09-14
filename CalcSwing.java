package Lab7;



import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class CalcSwing extends JFrame implements ActionListener{
	final int DEFAULT_FRAME_WIDTH = 320 ;
	final int DEFAULT_FRAME_HEIGHT = 500 ;
	private Font font1 ;
	private String total = "" ;
	private double value2 = 0.0 ;
	private String operand = "" ;
	private int operandPress = 0 ;
	private int decimalCount = 0;
	private double totalValue = 0.0 ;
	private JPanel panel1 ; 
	private JPanel calcPanel ;
	private JTextField display ; 
	private Container contentPane ;
	private JButton button0 ;
	private JButton button1  ;
	private JButton button2 ;
	private JButton button3 ;
	private JButton button4 ;
	private JButton button5 ;
	private JButton button6 ;
	private JButton button7 ;
	private JButton button8 ;
	private JButton button9 ;
	private JButton buttonPlus ;
	private JButton buttonMinus ;
	private JButton buttonDivide ;
	private JButton buttonEquals ;
	private JButton buttonMultiply ;
	private JButton buttonDecimal ;
	private JButton square ;
	private JButton cube ;
	private JButton del ;
	private JButton clear ;
	
public CalcSwing() {
		// TODO Auto-generated constructor stub
		font1 = new Font("Monotype Corsiva", Font.BOLD, 20);
		calcPanel = new JPanel() ;
		panel1 = new JPanel() ; 
		display = new JTextField("0.0") ;
		display.setFont(font1);
		display.setEditable(false);
		display.setBorder(BorderFactory.createCompoundBorder(display.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		contentPane = getContentPane() ;
		button0 = new JButton("0") ;
		button1 = new JButton("1") ;
		button2 = new JButton("2") ;
		button3 = new JButton("3") ;
		button4 = new JButton("4") ;
		button5 = new JButton("5") ;
		button6 = new JButton("6") ;
		button7 = new JButton("7") ;
		button8 = new JButton("8") ;
		button9 = new JButton("9") ;
		buttonPlus = new JButton("+") ;
		buttonMinus = new JButton("-") ;
		buttonDivide = new JButton("/") ;
		buttonEquals = new JButton("=") ;
		buttonMultiply = new JButton("x") ;
		buttonDecimal = new JButton(".") ;
		square = new JButton("x^2") ;
		cube = new JButton("x^3") ;
		del = new JButton("<") ;
		clear = new JButton("C") ;
		panel1.setLayout(new BorderLayout(0,20));
		calcPanel.setLayout(new GridLayout(5,4,15,15));
		calcPanel.add(del) ;
		calcPanel.add(square) ;
		calcPanel.add(cube) ;
		calcPanel.add(clear) ;
		calcPanel.add(button7) ;
		calcPanel.add(button8) ;
		calcPanel.add(button9) ;
		calcPanel.add(buttonPlus) ;
		calcPanel.add(button4) ;
		calcPanel.add(button5) ;
		calcPanel.add(button6) ;
		calcPanel.add(buttonMinus) ;
		calcPanel.add(button1) ;
		calcPanel.add(button2) ;
		calcPanel.add(button3) ;
		calcPanel.add(buttonDivide) ;
		calcPanel.add(button0) ;
		calcPanel.add(buttonDecimal) ;
		calcPanel.add(buttonEquals) ;
		calcPanel.add(buttonMultiply) ;
		panel1.add(display,"North");
		panel1.add(calcPanel,"Center") ;
		contentPane.add(panel1,"Center") ;
		square.addActionListener(this);
		cube.addActionListener(this);
		del.addActionListener(this);
		clear.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonPlus.addActionListener(this);
		buttonMinus.addActionListener(this);
		buttonEquals.addActionListener(this);
		buttonDivide.addActionListener(this);
		buttonDecimal.addActionListener(this);
		buttonMultiply.addActionListener(this);
		setSize(DEFAULT_FRAME_WIDTH,DEFAULT_FRAME_HEIGHT) ;
		addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		           System.exit(0);}});	
	}
public static void main (String[]args){
	CalcSwing c = new CalcSwing() ;
	c.setVisible(true);
}
@Override
public Insets getInsets()
{
   return new Insets(80,20,20,20);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
	if(e.getSource() == button1){
		total = total + "1" ;
		display.setText(total) ;
	}
	else if(e.getSource() == clear){
		value2 = 0.0 ;
		total = "" ;
		operand = "" ;
		operandPress = 0 ;
		decimalCount = 0;
		totalValue = 0.0 ;
		display.setText("" + totalValue) ;
	}
	else if(e.getSource() == del){
		if(display.getText().length() <= 1 || display.getText().equals("") ){
			display.setText("0.0");
			total = "";
		}
		else{
			display.setText("" + display.getText().substring(0, display.getText().length() - 1));
		}
	}
	else if(e.getSource() == square){
		total = "" + Math.pow(Double.parseDouble(display.getText()), 2) ;
		totalValue = Math.pow(Double.parseDouble(display.getText()), 2) ;
		display.setText(total) ;
		total = "" ;
	}
	else if(e.getSource() == cube){
		total = "" + Math.pow(Double.parseDouble(display.getText()), 3) ;
		totalValue = Math.pow(Double.parseDouble(display.getText()), 3) ;
		display.setText(total) ;
		total = "" ;
	}
	else if(e.getSource() == button2){
		total = total + "2" ;
		display.setText(total) ;
	}

	else if(e.getSource() == button3){
		total = total + "3" ;
		display.setText(total) ;
	}
	else if(e.getSource() == button4){
		total = total + "4" ;
		display.setText(total) ;
	}
	else if(e.getSource() == button5){
		total = total + "5" ;
		display.setText(total) ;
	}
	else if(e.getSource() == button6){
		total = total + "6" ;
		display.setText(total) ;
	}
	else if(e.getSource() == button7){
		total = total + "7" ;
		display.setText(total) ;
	}
	else if(e.getSource() == button8){
		total = total + "8" ;
		display.setText(total) ;
		super.requestFocusInWindow();
	}
	else if(e.getSource() == button9){
		total = total + "9" ;
		display.setText(total) ;
		super.requestFocusInWindow();
	}
	else if(e.getSource() == button0){
		total = total + "0" ;
		display.setText(total) ;
	}
	else if(e.getSource() == buttonPlus){
		decimalCount = 0 ;
		if(operandPress == 0){
			operand = "+" ; 
			totalValue = Double.parseDouble(display.getText());
			display.setText("+") ;
			total = "" ;
			operandPress++ ;
		}
		else if(display.getText().equals("+") || display.getText().equals("-") || display.getText().equals("/")  || display.getText().equals("x") ){
			display.setText("+") ;	
			operand = "+" ;
		}
		else if(Double.parseDouble(display.getText()) == totalValue && total == ""){
			display.setText("+") ;	
			total = "" ;
		}
		else if(operandPress > 0){
				value2 = Double.parseDouble(display.getText()) ;
				sum(totalValue,value2,operand) ;
				operand = "+" ;
			}
		operand = "+" ;	
	}
	else if(e.getSource() == buttonMinus){
		decimalCount = 0 ;
		if(operandPress == 0){
			operand = "-" ; 
			totalValue = Double.parseDouble(display.getText());
			display.setText("-") ;
			total = "" ;
			operandPress++ ;
		}
		else if(display.getText().equals("+") || display.getText().equals("-") || display.getText().equals("/")  || display.getText().equals("x") ){
			display.setText("-") ;	
			operand = "-" ;
		}
		else if(Double.parseDouble(display.getText()) == totalValue && total == ""){
			display.setText("-") ;	
			total = "" ;
		}
		else if(operandPress > 0){
			value2 = Double.parseDouble(display.getText()) ;
			sum(totalValue,value2,operand) ;
			operand = "-" ;
		}
		operand = "-" ;	
	}
	else if(e.getSource() == buttonDivide){
		decimalCount = 0 ;
		if(operandPress == 0){
			operand = "/" ; 
			totalValue = Double.parseDouble(display.getText());
			display.setText("/") ;
			total = "" ;
			operandPress++ ;
		}
		else if(display.getText().equals("+") || display.getText().equals("-") || display.getText().equals("/")  || display.getText().equals("x") ){
			display.setText("/") ;	
			operand = "/" ;
		}
		else if(Double.parseDouble(display.getText()) == totalValue && total == ""){
			display.setText("/") ;	
			total = "" ;
		}
		else if(operandPress > 0){
			value2 = Double.parseDouble(display.getText()) ;
			sum(totalValue,value2,operand) ;
			operand = "/" ;
		}
		operand = "/" ;
		super.requestFocusInWindow();	
	}
	else if(e.getSource() == buttonMultiply){
		decimalCount = 0 ;
		if(operandPress == 0){
			operand = "x" ; 
			totalValue = Double.parseDouble(display.getText());
			display.setText("x") ;
			total = "" ;
			operandPress++ ;
		}
		else if(display.getText().equals("+") || display.getText().equals("-") || display.getText().equals("/")  || display.getText().equals("x") ){
			display.setText("x") ;	
			operand = "x" ;
		}
		else if(Double.parseDouble(display.getText()) == totalValue && total == ""){
			display.setText("x") ;	
			total = "" ;
		}
		else if(operandPress > 0){
			value2 = Double.parseDouble(display.getText()) ;
			sum(totalValue,value2,operand) ;
			operand = "x" ;
		}
		operand = "x" ;
	}
	else if(e.getSource() == buttonEquals){
		decimalCount = 0 ;
		if(operandPress == 0){ 
			totalValue = Double.parseDouble(display.getText());
			display.setText(totalValue + "") ;
		}
		else if(display.getText().equals("=") || display.getText().equals("+") || display.getText().equals("-") || display.getText().equals("/")  || display.getText().equals("x")){
			display.setText("" + totalValue) ;	
		}
		else if(Double.parseDouble(display.getText()) == totalValue && total == ""){
			display.setText("" + totalValue) ;	
			total = "" ;
		}
		else if(operandPress > 0){
			value2 = Double.parseDouble(display.getText()) ;
			sum(totalValue,value2,operand) ;
			display.setText("" + totalValue) ;
		}
		operand = "" ;
		totalValue = Double.parseDouble(display.getText());	
	}
	else if(e.getSource() == buttonDecimal){
		if(decimalCount > 0){
		}
		else{
		total = total + "."   ;
		display.setText(total) ;
		decimalCount++ ;
		}	
	}
	super.requestFocusInWindow();
}
private void sum(double totalValue, double value2, String operand) {
	// TODO Auto-generated method stub
	double result ;
	
	if(operand == "+"){
		result = totalValue + value2 ;
		this.totalValue = result ;
		display.setText(result + "") ;
		this.total = "" ;
		this.value2 = 0 ;		
	}
	else if(operand == "-"){
		result = totalValue - value2 ;
		this.totalValue = result ;
		display.setText(result + "") ;
		this.total = "" ;
		this.value2 = 0 ;		
	}
	else if(operand == "/"){
		result = totalValue / value2 ;
		this.totalValue = result ;
		display.setText(result + "") ;
		this.total = "" ;
		this.value2 = 0 ;		
	}
	else if(operand == "x"){
		result = totalValue * value2 ;
		this.totalValue = result ;
		display.setText(result + "") ;
		this.total = "" ;
		this.value2 = 0 ;		
	}
}
	
}



