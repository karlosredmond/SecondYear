package Lab7;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Calculator extends JFrame implements ActionListener,KeyListener{
	Font font1 = new Font("Monotype Corsiva", Font.BOLD, 20);
	private double value2 = 0.0 ;
	private String total = "" ;
	private String operand = "" ;
	private int operandPress = 0 ;
	private int decimalCount = 0;
	private double totalValue = 0.0 ;
	private JPanel panel1=new JPanel();
	private JTextField display = new JTextField("0");	
	private JButton JButton0 = new JButton("0") ;
	private JButton JButton1 = new JButton("1") ;
	private JButton JButton2 = new JButton("2") ;
	private JButton JButton3 = new JButton("3") ;
	private JButton JButton4 = new JButton("4") ;
	private JButton JButton5 = new JButton("5") ;
	private JButton JButton6 = new JButton("6") ;
	private JButton JButton7 = new JButton("7") ;
	private JButton JButton8 = new JButton("8") ;
	private JButton JButton9 = new JButton("9") ;
	private JButton JButtonPlus = new JButton("+") ;
	private JButton JButtonMinus = new JButton("-") ;
	private JButton JButtonDivide = new JButton("/") ;
	private JButton JButtonEquals = new JButton("=") ;
	private JButton JButtonMultiply = new JButton("x") ;
	private JButton JButtonDecimal = new JButton(".") ;
	private JButton square = new JButton("x^2") ;
	private JButton cube = new JButton("x^3") ;
	private JButton del = new JButton("DEL") ;
	private JButton clear = new JButton("C") ;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Calculator(){
		requestFocusInWindow();
		addKeyListener(this) ;
		display.setBorder(BorderFactory.createCompoundBorder(display.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
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
		JButton1.addActionListener(this);
		JButton2.addActionListener(this);
		JButton3.addActionListener(this);
		JButton4.addActionListener(this);
		JButton5.addActionListener(this);
		JButton6.addActionListener(this);
		JButton7.addActionListener(this);
		JButton8.addActionListener(this);
		JButton9.addActionListener(this);
		JButton0.addActionListener(this);
		JButtonPlus.addActionListener(this);
		JButtonMinus.addActionListener(this);
		JButtonEquals.addActionListener(this);
		JButtonDivide.addActionListener(this);
		JButtonDecimal.addActionListener(this);
		JButtonMultiply.addActionListener(this);
		panel1.setLayout(new GridLayout(5, 4, 20, 20));
		panel1.add(clear) ;
		panel1.add(square) ;
		panel1.add(cube) ;
		panel1.add(del) ;
		panel1.add(JButton7) ;
		panel1.add(JButton8) ;
		panel1.add(JButton9) ;
		panel1.add(JButtonPlus) ;
		panel1.add(JButton4) ;
		panel1.add(JButton5) ;
		panel1.add(JButton6) ;
		panel1.add(JButtonMinus) ;
		panel1.add(JButton1) ;
		panel1.add(JButton2) ;
		panel1.add(JButton3) ;
		panel1.add(JButtonDivide) ;
		panel1.add(JButton0) ;
		panel1.add(JButtonDecimal) ;
		panel1.add(JButtonEquals) ;
		panel1.add(JButtonMultiply) ;
		add(panel1) ;
		addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		           System.exit(0);}});
	}
	public static void main(String[] args){
    Calculator f = new Calculator();
    f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == JButton1){
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
		else if(e.getSource() == JButton2){
			total = total + "2" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}

		else if(e.getSource() == JButton3){
			total = total + "3" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == JButton4){
			total = total + "4" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == JButton5){
			total = total + "5" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == JButton6){
			total = total + "6" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == JButton7){
			total = total + "7" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == JButton8){
			total = total + "8" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == JButton9){
			total = total + "9" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == JButton0){
			total = total + "0" ;
			display.setText(total) ;
			super.requestFocusInWindow();
		}
		else if(e.getSource() == JButtonPlus){
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
		else if(e.getSource() == JButtonMinus){
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
		else if(e.getSource() == JButtonDivide){
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
		else if(e.getSource() == JButtonMultiply){
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
		else if(e.getSource() == JButtonEquals){
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
		else if(e.getSource() == JButtonDecimal){
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
