package Lab6;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ConversionTool implements ActionListener, ItemListener {

	private JFrame cToolFrame;
	private JRadioButton rdbtnTemperature;
	private JRadioButton rdbtnMeasurement;
	private JRadioButton rdbtnCurrency;
	private JLabel lblFrom;
	private JLabel lblTo;
	private JButton btnSwap;
	private JButton btnConvert;
	private JComboBox comboBoxTo;
	private JComboBox comboBoxFrom;
	private String[] measurementList = {"Inches", "Feet"}; //for dropdown
	private String[] currencyList = {"Sterling","Euro"};
	private String[] temperatureList = {"Celsius","Fahrenheit"};
	ButtonGroup radioButtons ;

	//Create the application.
	public ConversionTool() {
		cToolFrame = new JFrame();
		cToolFrame.setTitle("Multi Conversion Tool");
		cToolFrame.setBounds(100, 100, 351, 333);
		cToolFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		cToolFrame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		//http://examples.javacodegeeks.com/desktop-java/awt/event/jradiobutton-with-itemstatechanged-listener-example/
		//http://www.java2s.com/Tutorial/Java/0240__Swing/ListeningtoJRadioButtonEventswithanItemListener.htm
		rdbtnTemperature = new JRadioButton("Temperature");
		rdbtnTemperature.addItemListener(this);
		panel.add(rdbtnTemperature);
		
		rdbtnMeasurement = new JRadioButton("Measurement");
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnMeasurement, 23, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnTemperature, 0, SpringLayout.NORTH, rdbtnMeasurement);
		rdbtnMeasurement.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnMeasurement.addItemListener(this);
		panel.add(rdbtnMeasurement);
		
		rdbtnCurrency = new JRadioButton("Currency");
		sl_panel.putConstraint(SpringLayout.WEST, rdbtnCurrency, 127, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, rdbtnTemperature, -6, SpringLayout.WEST, rdbtnCurrency);
		sl_panel.putConstraint(SpringLayout.WEST, rdbtnMeasurement, 11, SpringLayout.EAST, rdbtnCurrency);
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnCurrency, 45, SpringLayout.NORTH, panel);
		rdbtnCurrency.addItemListener(this);
		panel.add(rdbtnCurrency);
		
		lblFrom = new JLabel("From:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblFrom, 56, SpringLayout.SOUTH, rdbtnTemperature);
		sl_panel.putConstraint(SpringLayout.WEST, lblFrom, 95, SpringLayout.WEST, panel);
		panel.add(lblFrom);
		
		lblTo = new JLabel("To:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblTo, 0, SpringLayout.NORTH, lblFrom);
		sl_panel.putConstraint(SpringLayout.WEST, lblTo, 71, SpringLayout.EAST, lblFrom);
		panel.add(lblTo);
		
		btnSwap = new JButton("     Swap     ");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnSwap, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnSwap, 0, SpringLayout.EAST, lblTo);
		btnSwap.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(btnSwap);
		
		btnConvert = new JButton("   Convert   ");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnConvert, -30, SpringLayout.NORTH, btnSwap);
		sl_panel.putConstraint(SpringLayout.EAST, btnConvert, 0, SpringLayout.EAST, lblTo);
		panel.add(btnConvert);
		
		comboBoxTo = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBoxTo, 27, SpringLayout.SOUTH, lblTo);
		sl_panel.putConstraint(SpringLayout.WEST, comboBoxTo, 186, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, comboBoxTo, -62, SpringLayout.EAST, panel);
		panel.add(comboBoxTo);
		
		comboBoxFrom = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBoxFrom, 0, SpringLayout.NORTH, comboBoxTo);
		sl_panel.putConstraint(SpringLayout.WEST, comboBoxFrom, 60, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, comboBoxFrom, -39, SpringLayout.WEST, comboBoxTo);
		panel.add(comboBoxFrom);
		
		radioButtons = new ButtonGroup();
		radioButtons.add(rdbtnTemperature);
		radioButtons.add(rdbtnCurrency);
		radioButtons.add(rdbtnMeasurement);
	}//end constructor

	public void actionPerformed(ActionEvent e) {
	//Trying to fix method below first, not worried about this gonna re-use code from currency converter
	}//end actionPerformed
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getSource().equals(rdbtnTemperature));
		if (e.getSource().equals(rdbtnTemperature)){
			comboBoxTo.removeAllItems();
			comboBoxFrom.removeAllItems();
			for (String item : temperatureList) {//add elements of array to dropdown (comboBox)
				comboBoxTo.addItem(item);
				comboBoxFrom.addItem(item);
			}
		}
		else if (e.getSource().equals(rdbtnCurrency)){
			comboBoxTo.removeAllItems();
			comboBoxFrom.removeAllItems();
			for (String item : currencyList) {//add elements of array to dropdown (comboBox)
				comboBoxTo.addItem(item);
				comboBoxFrom.addItem(item);
			}
		}
		else if (e.getSource().equals(rdbtnMeasurement)){
			//comboBoxTo.setText(temperatureList);
			comboBoxTo.removeAllItems();
			comboBoxFrom.removeAllItems();
			for (String item : measurementList) {//add elements of array to dropdown (comboBox)
				comboBoxTo.addItem(item);
				comboBoxFrom.addItem(item);
			}
		}
	}//end itemStateChanged
	
	//Launch the application.
	public static void main(String[] args) {
		ConversionTool cToolObject1 = new ConversionTool();
		cToolObject1.cToolFrame.setVisible(true);
	}//end main

}//end class