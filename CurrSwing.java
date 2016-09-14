package Lab7;

import javax.swing.* ;

import java.awt.* ;
import java.awt.event.*;
import java.text.DecimalFormat;

public class CurrSwing extends JFrame implements ItemListener,ActionListener{
	final int DEFAULT_FRAME_WIDTH = 150 ;
	final int DEFAULT_FRAME_HEIGHT = 250 ;
	private Font font1 ;
	DecimalFormat decim = new DecimalFormat("0.00") ;
	private double value1 = 0.0 ;
	private double converter = 0.0 ;
	private JComboBox box1,box2 ;
	private JTextField display1,display2 ;
	private JButton convert,swap ;
	private JPanel panel1 ;
	private String euro = "Euro" ;
	private String GBP = "GBP" ;
	private String USD = "USD" ;
	private String AUD = "AUD" ;
	private String tempString,tempChoice ;

	public CurrSwing() {
		// TODO Auto-generated constructor stub
		
		Container contentPane = getContentPane() ;
		convert = new JButton("Convert") ;
		swap = new JButton("Swap") ;
		convert.addActionListener(this) ;
		swap.addActionListener(this) ;
		display1 = new JTextField() ;
		display2 = new JTextField() ;
		display1.setText("0.0");
		display2.setText("0.0");
		display1.setFont(font1);
		display2.setFont(font1);
		font1 = new Font("Monotype Corsiva", Font.BOLD, 20);
		box1 = new JComboBox() ;
		box2 = new JComboBox() ;
		box1.addItemListener(this) ;
		box1.setFont(font1) ;
		box2.setFont(font1) ;
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3,2,10,10));
		box1.addItem(euro);
		box1.addItem(GBP);
		box1.addItem(USD);
		box1.addItem(AUD);
		box2.addItem(euro);
		box2.addItem(GBP);
		box2.addItem(USD);
		box2.addItem(AUD);
		panel1.add(box1);
		panel1.add(display1);
		panel1.add(box2);
		panel1.add(display2);
		panel1.add(swap);
		panel1.add(convert);
		contentPane.add(panel1,"Center") ;
		addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		           System.exit(0);}});
	}
public static void main(String [] args){
	CurrSwing c = new CurrSwing() ;
	c.setVisible(true);
	c.pack();
}
@Override
public void itemStateChanged(ItemEvent arg0) {
	// TODO Auto-generated method stub

	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == convert){
		value1 = Double.parseDouble(display1.getText()) ;	
		if((String)box1.getSelectedItem() ==  (String)box2.getSelectedItem()){
				display1.setText("" + value1) ;	
				display2.setText("" + value1) ;	
		}
		else{
			switch((String)box1.getSelectedItem()){
				case "Euro":
					switch((String)box2.getSelectedItem()){
						case "GBP":
							converter = 0.76 ;
							break ;
						case "AUD":
							converter = 1.53 ;
							break;
						case "USD":
							converter = 1.12 ;
							break ;
					}
					Calculation(value1,converter) ;
					break;
				case "GBP":
					switch((String)box2.getSelectedItem()){
						case "Euro":
							converter = 1.29805 ;
							break ;
						case "AUS":
							converter = 2.01 ;
							break;
						case "USD":
							converter = 1.42 ;
							break;
					}
					Calculation(value1,converter) ;
					break;
				case "AUS":
					switch((String)box2.getSelectedItem()){
						case "Euro":
							converter = 0.65 ;
							break ;
						case "GBP":
							converter = 0.50 ;
							break;
						case "USD":
							converter = 0.71 ;
							break;
					}
					Calculation(value1,converter) ;
					break;
				case "USD":
					switch((String)box2.getSelectedItem()){
						case "Euro":
							converter = 0.92 ;
							break ;
						case "GBP":
							converter = 0.70 ;
							break;
						case "AUS":
							converter = 1.41 ;
							break;
					}
					Calculation(value1,converter) ;
					break;	
			}
		}
	}
	else if(e.getSource() == swap){
		tempString = display1.getText() ;
		tempChoice = (String)box1.getSelectedItem();
		display1.setText(display2.getText()) ;
		display2.setText(tempString) ;
		box1.setSelectedItem(box2.getSelectedItem()) ;
		box2.setSelectedItem(tempChoice) ;	
	}	
}
private void Calculation(double value, double operation) {
	// TODO Auto-generated method stub
	value = value * operation ;
	display2.setText("" + decim.format(value) );
}
}
