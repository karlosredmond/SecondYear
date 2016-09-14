package Lab7;
import javax.swing.* ;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class MultiTool extends JFrame implements ItemListener,ActionListener{
	DecimalFormat decim = new DecimalFormat("0.00") ;
	private static final long serialVersionUID = 1L;
	private double value1 = 0.0 ;
	private double converter = 0.0 ;
	private String tempString = "" ;
	private String tempChoice = "" ;
	private JTextField  display1,display2 ;
	private JComboBox box1,box2 ;
	private JButton convert,swap ;
	private JRadioButton temp,curr,meas ;
	private ButtonGroup radioGroup ;
	private JPanel p1,p2,p3,p4 ;
	private Font font1 ;


	public MultiTool() {
		// TODO Auto-generated constructor stub
		font1 = new Font("Monotype Corsiva", Font.BOLD, 20);
		temp = new JRadioButton("Temperature") ;
		curr = new JRadioButton("Currency") ;
		meas = new JRadioButton("Measurement") ;
		temp.addItemListener(this) ;
		curr.addItemListener(this) ;
		meas.addItemListener(this) ;
		radioGroup = new ButtonGroup() ;
		display1 = new JTextField("0.0",5) ;
		display2 = new JTextField("0.0",5) ;
		convert = new JButton("Convert") ;
		swap = new JButton("Swap") ;
		convert.addActionListener(this);
		swap.addActionListener(this);
		display1.setFont(font1);
		display2.setFont(font1);
		radioGroup.add(temp) ;
		radioGroup.add(meas) ;
		radioGroup.add(curr) ;
		box1 = new JComboBox() ;
		box1.addItem("Euro");
		box1.addItem("GBP") ;
		box2 = new JComboBox() ;
		box2.addItem("Euro");
		box2.addItem("GBP") ;
		box1.setFont(font1);
		box2.setFont(font1);
		p1 = new JPanel() ;
		p1.setLayout(new BorderLayout(10,10));
		p2 = new JPanel() ;
		p2.setLayout(new GridLayout(1,3));
		p2.add(temp) ;
		p2.add(meas) ;
		p2.add(curr) ;
		p3 = new JPanel() ;
		p3.setLayout(new FlowLayout());
		p3.add(box1) ;
		p3.add(display1) ;
		p3.add(box2) ;
		p3.add(display2) ;
		p4 = new JPanel(new FlowLayout()) ;
		p4.add(swap) ;
		p4.add(convert) ;
		p1.add(p2,"North") ;
		p1.add(p3,"Center") ;
		p1.add(p4,"South") ;
		Container contentPane = getContentPane() ;
		contentPane.add(p1) ;
		curr.setSelected(true);
		addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		           System.exit(0);}});	
	}
public static void main(String[]args){
	MultiTool m = new MultiTool() ;
	m.setVisible(true) ;
	m.pack() ;
}
@Override
public void itemStateChanged(ItemEvent e) {
	
	// TODO Auto-generated method stub
	
	display1.setText("" + 0.0) ;
	display2.setText("" + 0.0) ;
	if(e.getSource() == meas){
		box1.removeAllItems();
		box2.removeAllItems();
		box1.addItem("Feet") ;
		box1.addItem("Inches") ;
		box2.addItem("Feet") ;
		box2.addItem("Inches") ;
		pack() ;
	}
	else if(e.getSource() == curr){
		box1.removeAllItems();
		box2.removeAllItems();
		box1.addItem("Euro") ;
		box1.addItem("GBP") ;
		box2.addItem("Euro") ;
		box2.addItem("GBP") ;
		
	}
	else if(e.getSource() == temp){
		box1.removeAllItems();
		box2.removeAllItems();
		box1.addItem("Celc") ;
		box1.addItem("Fahr") ;
		box2.addItem("Celc") ;
		box2.addItem("Fahr") ;
		
	}
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
					}
					Calculation(value1,converter) ;
					break;
				case "GBP":
					switch((String)box2.getSelectedItem()){
						case "Euro":
							converter = 1.29805 ;
							break ;
					}
					Calculation(value1,converter) ;
					break;
				case "Feet":
					switch((String)box2.getSelectedItem()){
						case "Inches":
							converter = 12 ;
							break;
					}
					Calculation(value1,converter) ;
					break;
				case "Inches":
					switch((String)box2.getSelectedItem()){
						case "Feet":
							converter = .083333333333333;
							break ;
					}
					Calculation(value1,converter) ;
					break;
				case "Celc":
					switch((String)box2.getSelectedItem()){
						case "Fahr":
							converter = 1 ;
							break ;
					}
					temp(converter) ;
					break;
				case "Fahr":
					switch((String)box2.getSelectedItem()){
						case "Celc":
							converter = 0 ;
							break ;
					}
					temp(converter) ;
					break;
			}
		}
	}
	else if(e.getSource() == swap){
		tempString = display1.getText() ;
		tempChoice = (String)box1.getSelectedItem();
		display1.setText(display2.getText()) ;
		display2.setText(tempString) ;
		box1.setSelectedItem((String)box2.getSelectedItem()) ;
		box2.setSelectedItem((String)tempChoice) ;	
	}
}
public void Calculation(double value,double operation){
	System.out.println("Hello") ;
	value = value * operation ;
	display2.setText("" + decim.format(value));			
}
public void temp(double value){
	if(value == 1){
		display2.setText("" + (((Double.parseDouble(display1.getText()) * 9/5)+32)));
	}
	else{
		display2.setText("" + (((Double.parseDouble(display1.getText()) - 32)*5/9)));
	}
}
}
	


