package Lab6;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class question9 extends Frame implements ActionListener{
	/**
	 * 
	 */
	    private question8a calc = new question8a() ;
	    private conversion conv = new conversion() ;
		MenuBar mbar;
		Menu menu,submenu;
		MenuItem currency,calculator,multi;
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
		private Button swap = new Button("Swap") ;
		private Panel p1 = new Panel() ;
		private Panel p2 = new Panel() ;
		private Panel p3 = new Panel() ;
		
	public question9() {
		// TODO Auto-generated constructor stub
		calc.setVisible(false) ;
		conv.setVisible(false) ;
		mbar = new MenuBar() ;
		menu = new Menu("Menu") ;
		submenu = new Menu("Sub Menu") ;
		calculator = new MenuItem("Calculator") ;
		currency = new MenuItem("Currency") ;
		multi = new MenuItem("Multi Tool") ;
		calculator.addActionListener(this) ;
		multi.addActionListener(this) ;
		currency.addActionListener(this) ;
		menu.add(calculator) ;
		menu.add(currency) ;
		menu.add(multi) ;
		mbar.add(menu) ;
		setMenuBar(mbar) ;
		convert.addActionListener(this) ;
		swap.addActionListener(this) ;
		choice1.add("EUR");
		choice1.add("GBP");
		choice1.add("AUS");
		choice1.add("USD");
		choice2.add("EUR");
		choice2.add("GBP");
		choice2.add("AUS");
		choice2.add("USD");
		setLayout(new BorderLayout()) ;
		setTitle("Currency Converter") ;
		setSize(350, 210);
		setVisible(true);
		p1.setLayout(new GridLayout(1,2));
		p2.setLayout(new GridLayout(1,2));
		p3.setLayout(new GridLayout(1,2));
		p1.add(choice1) ;
		p1.add(display) ;
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
		new question9();	
		
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
					case "EUR":
						switch(choice2.getSelectedItem()){
							case "GBP":
								converter = 0.76 ;
								break ;
							case "AUS":
								converter = 1.53 ;
								break;
							case "USD":
								converter = 1.08 ;
								break ;
						}
						Calculation(value1,converter) ;
						break;
					case "GBP":
						switch(choice2.getSelectedItem()){
							case "EUR":
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
						switch(choice2.getSelectedItem()){
							case "EUR":
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
						switch(choice2.getSelectedItem()){
							case "EUR":
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
			tempString = display.getText() ;
			tempChoice = choice1.getSelectedItem();
			display.setText(display2.getText()) ;
			display2.setText(tempString) ;
			choice1.select(choice2.getSelectedItem()) ;
			choice2.select(tempChoice) ;	
		}
		else if(e.getSource() == calculator){
			this.setVisible(false) ;
			conv.setVisible(false);
			calc.setMenuBar(mbar) ;
			calc.setVisible(true) ;
		}
		else if(e.getSource() == multi){
			calc.setVisible(false);
			this.setVisible(false);
			conv.setMenuBar(mbar) ;
			conv.setVisible(true) ;	
		}
		else if(e.getSource() == currency){
			calc.setVisible(false);
			conv.setVisible(false);
			this.setMenuBar(mbar) ;
			this.setVisible(true) ;	
		}

	}
	public void Calculation(double value,double operation){
			value = value * operation ;
			display2.setText("" + decim.format(value) );			
	}
}


