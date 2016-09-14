package Lab6;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class conversion extends Frame implements ActionListener,ItemListener{
	/**
	 * 
	 */
		DecimalFormat decim = new DecimalFormat("0.00") ;
		private static final long serialVersionUID = 1L;
		private double value1 = 0.0 ;
		private double converter = 0.0 ;
		private String tempString = "" ;
		private String tempChoice = "" ;
		private TextField  display = new TextField("" + value1) ;
		private TextField  display2 = new TextField("" + value1) ;
		private Choice choice1 = new Choice() ;
		private Choice choice2 = new Choice() ;
		private Button convert = new Button("Convert") ;
		private JButton swap = new JButton(new ImageIcon("C:\\Users\\Karl\\Desktop\\College Stuff\\SecondYear\\Java\\src\\Lab6\\switch.png")) ;
		private Panel p1 = new Panel() ;
		private Panel p2 = new Panel() ;
		private Panel p3 = new Panel() ;
		CheckboxGroup lngGrp = new CheckboxGroup();
		Checkbox measurement = new Checkbox("Measurement", lngGrp, false);
        Checkbox curr = new Checkbox("Currency", lngGrp, false);
        Checkbox temp = new Checkbox("Temperature", lngGrp, false);
		
	public conversion() {
		// TODO Auto-generated constructor stub
		convert.addActionListener(this) ;
		temp.addItemListener(this) ;
		curr.addItemListener(this) ;
		measurement.addItemListener(this) ;
		lngGrp.setSelectedCheckbox(curr);
		swap.addActionListener(this) ;
		choice1.add("Euro");
		choice1.add("Pound");
		choice2.add("Euro");
		choice2.add("Pound");
		setLayout(new BorderLayout()) ;
		setTitle("Converter") ;
		setSize(350, 250);
		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p3.setLayout(new FlowLayout());
		p1.add(curr) ;
		p1.add(measurement) ;
		p1.add(temp) ;
		p2.add(choice1) ;
		p2.add(display) ;
		p2.add(choice2) ;
		p2.add(display2) ;
		p3.add(swap) ;
		p3.add(convert) ;
		add(p1,"North");
		add(p2,"Center") ;
		add(p3,"South") ;
		addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		           System.exit(0);}});	
	}
	public static void main(String args[]){
		conversion c=new conversion();	
		c.setVisible(true);
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == convert){
			value1 = Double.parseDouble(display.getText()) ;	
			if(choice1.getSelectedItem() ==  choice2.getSelectedItem()){
					display.setText("" + value1) ;	
					display2.setText("" + value1) ;	
			}
			else{
				switch(choice1.getSelectedItem()){
					case "Euro":
						switch(choice2.getSelectedItem()){
							case "Pound":
								converter = 0.76 ;
								break ;
						}
						Calculation(value1,converter) ;
						break;
					case "Pound":
						switch(choice2.getSelectedItem()){
							case "Euro":
								converter = 1.29805 ;
								break ;
						}
						Calculation(value1,converter) ;
						break;
					case "Feet":
						switch(choice2.getSelectedItem()){
							case "Inches":
								converter = 12 ;
								break;
						}
						Calculation(value1,converter) ;
						break;
					case "Inches":
						switch(choice2.getSelectedItem()){
							case "Feet":
								converter = .083333333333333;
								break ;
						}
						Calculation(value1,converter) ;
						break;
					case "Celc":
						switch(choice2.getSelectedItem()){
							case "Fahr":
								converter = 1 ;
								break ;
						}
						temp(converter) ;
						break;
					case "Fahr":
						switch(choice2.getSelectedItem()){
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
			tempString = display.getText() ;
			tempChoice = choice1.getSelectedItem();
			display.setText(display2.getText()) ;
			display2.setText(tempString) ;
			choice1.select(choice2.getSelectedItem()) ;
			choice2.select(tempChoice) ;	
		}
	}
	public void Calculation(double value,double operation){
			value = value * operation ;
			display2.setText("" + decim.format(value) );			
	}
	public void temp(double value){
		if(value == 1){
			display2.setText("" + (((Double.parseDouble(display.getText()) * 9/5)+32)));
		}
		else{
			display2.setText("" + (((Double.parseDouble(display.getText()) - 32)*5/9)));
		}
}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		display.setText("" + 0.0) ;
		display2.setText("" + 0.0) ;
		if(e.getSource() == measurement){
			choice1.removeAll();
			choice2.removeAll();
			choice1.insert("Feet",0) ;
			choice1.insert("Inches",1) ;
			choice2.insert("Feet",0) ;
			choice2.insert("Inches",1) ;
			
		}
		else if(e.getSource() == curr){
			choice1.removeAll();
			choice2.removeAll();
			choice1.insert("Euro",0) ;
			choice1.insert("Pound",1) ;
			choice2.insert("Euro",0) ;
			choice2.insert("Pound",1) ;
			
		}
		else if(e.getSource() == temp){
			choice1.removeAll();
			choice2.removeAll();
			choice1.insert("Celc",0) ;
			choice1.insert("Fahr",1) ;
			choice2.insert("Celc",0) ;
			choice2.insert("Fahr",1) ;
			
		}
	}
	@Override
	   public Insets getInsets()
	   {
	      return new Insets(130,20,20,20);
	   }
}




