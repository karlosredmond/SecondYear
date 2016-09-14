package Lab6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class question8a extends Frame implements ActionListener,KeyListener{
	Font font1 = new Font("Monotype Corsiva", Font.BOLD, 20);
	private double value2 = 0.0 ;
	private String total = "" ;
	private String operand = "" ;
	private int operandPress = 0 ;
	private int decimalCount = 0;
	private double totalValue = 0.0 ;
	private Panel panel1;
	private JTextField display ;
	private Button button0  ;
	private Button button1  ;
	private Button button2 ;
	private Button button3 ;
	private Button button4 ;
	private Button button5 ;
	private Button button6 ;
	private Button button7 ;
	private Button button8 ;
	private Button button9 ;
	private Button buttonPlus ;
	private Button buttonMinus ;
	private Button buttonDivide ;
	private Button buttonEquals;
	private Button buttonMultiply ;
	private Button buttonDecimal ;
	private Button square ;
	private Button cube ;
	private Button del ;
	private Button clear ;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public question8a(){
		requestFocusInWindow();
		display = new JTextField("0");
		panel1=new Panel();
		button0 = new Button("0");
		button1 = new Button("1") ;
		button2 = new Button("2") ;
		button3 = new Button("3") ;
		button4 = new Button("4") ;
		button5 = new Button("5") ;
		button6 = new Button("6") ;
		button7 = new Button("7") ;
		button8 = new Button("8") ;
		button9 = new Button("9") ;
		buttonMinus = new Button("-") ;
		buttonPlus = new Button("+") ;
		buttonDivide = new Button("/") ;
		buttonEquals = new Button("=") ;
		buttonMultiply = new Button("x") ;
		buttonDecimal = new Button(".") ;
		square = new Button("x^2") ;
		cube = new Button("x^3") ;
		del = new Button("DEL") ;
		clear = new Button("C") ;
		addKeyListener(this) ;
		display.setBorder(BorderFactory.createCompoundBorder(display.getBorder(),BorderFactory.createEmptyBorder(0, 0, 0, 0)));
		setLayout(new BorderLayout(0,30)) ;
		setSize(340, 550);
		setTitle("Calcultator");
		setBackground(Color.lightGray);
		display.setEditable(false) ;
		display.setFont(font1);
		add(display, "North") ;
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
		panel1.setLayout(new GridLayout(5, 4, 20, 20));
		panel1.add(clear) ;
		panel1.add(square) ;
		panel1.add(cube) ;
		panel1.add(del) ;
		panel1.add(button7) ;
		panel1.add(button8) ;
		panel1.add(button9) ;
		panel1.add(buttonPlus) ;
		panel1.add(button4) ;
		panel1.add(button5) ;
		panel1.add(button6) ;
		panel1.add(buttonMinus) ;
		panel1.add(button1) ;
		panel1.add(button2) ;
		panel1.add(button3) ;
		panel1.add(buttonDivide) ;
		panel1.add(button0) ;
		panel1.add(buttonDecimal) ;
		panel1.add(buttonEquals) ;
		panel1.add(buttonMultiply) ;
		add(panel1) ;
		addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		           System.exit(0);}});
	}
	public static void main(String[] args){
    question8a f = new question8a();
    f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1){
			total = total + "1" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == clear){
			value2 = 0.0 ;
			total = "" ;
			operand = "" ;
			operandPress = 0 ;
			decimalCount = 0;
			totalValue = 0.0 ;
			display.setText("" + totalValue) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == del){
			if(display.getText().length() <= 1 || display.getText().equals("") ){
				display.setText("0.0");
				total = "";
			}
			else{
				display.setText("" + display.getText().substring(0, display.getText().length() - 1));
			}
			super.requestFocusInWindow();
		}
		else if(e.getSource() == square){
			total = "" + Math.pow(Double.parseDouble(display.getText()), 2) ;
			totalValue = Math.pow(Double.parseDouble(display.getText()), 2) ;
			display.setText(total) ;
			total = "" ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == cube){
			total = "" + Math.pow(Double.parseDouble(display.getText()), 3) ;
			totalValue = Math.pow(Double.parseDouble(display.getText()), 3) ;
			display.setText(total) ;
			total = "" ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == button2){
			total = total + "2" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}

		else if(e.getSource() == button3){
			total = total + "3" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == button4){
			total = total + "4" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == button5){
			total = total + "5" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == button6){
			total = total + "6" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == button7){
			total = total + "7" ;
			display.setText(total) ;
			super.requestFocusInWindow();
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
			super.requestFocusInWindow();
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
			super.requestFocusInWindow();	
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
			super.requestFocusInWindow();	
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
			super.requestFocusInWindow();	
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
			super.requestFocusInWindow();	
		}
		else if(e.getSource() == buttonDecimal){
			if(decimalCount > 0){
			}
			else{
			total = total + "."   ;
			display.setText(total) ;
			decimalCount++ ;
			}
			super.requestFocusInWindow();
		}
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
	@Override
	   public Insets getInsets()
	   {
	      return new Insets(140,20,20,20);
	   }
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
				if(display.getText().length() <= 1 || display.getText().equals("") ){
					display.setText("0.0");
					total = "";
				}
				else{
					display.setText("" + display.getText().substring(0, display.getText().length() - 1));
				}
				super.requestFocusInWindow();
		 }
		 else if (e.getKeyCode() == KeyEvent.VK_ENTER){
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
				super.requestFocusInWindow();	
			}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == '1'){
			total = total + "1" ;
			display.setText(total) ;
		}
		else if(e.getKeyChar() == '2'){
			total = total + "2" ;
			display.setText(total) ;
		}
		else if(e.getKeyChar() == '3'){
			total = total + "3" ;
			display.setText(total) ;
		}
		else if(e.getKeyChar() == '4'){
			total = total + "4" ;
			display.setText(total) ;
		}
		else if(e.getKeyChar() == '5'){
			total = total + "5" ;
			display.setText(total) ;
		}
		else if(e.getKeyChar() == '6'){
			total = total + "6" ;
			display.setText(total) ;
		}
		else if(e.getKeyChar() == '7'){
			total = total + "7" ;
			display.setText(total) ;
		}
		else if(e.getKeyChar() == '8'){
			total = total + "8" ;
			display.setText(total) ;
		}
		else if(e.getKeyChar() == '9'){
			total = total + "9" ;
			display.setText(total) ;
		}
		else if(e.getKeyChar() == '0'){
			total = total + "0" ;
			display.setText(total) ;
		}
		else if(e.getKeyChar() == '+'){
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
			super.requestFocusInWindow();	
		}
		else if(e.getKeyChar() == '-'){
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
			super.requestFocusInWindow();	
		}
		else if(e.getKeyChar() == '/'){
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
		else if(e.getKeyChar() == '*'){
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
			super.requestFocusInWindow();	
		}
		else if(e.getKeyChar() == '='){
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
			super.requestFocusInWindow();	
		}
		else if(e.getKeyChar() == '.'){
			if(decimalCount > 0){
			}
			else{
			total = total + "."   ;
			display.setText(total) ;
			decimalCount++ ;
			}
			super.requestFocusInWindow();
		}

	}
}
