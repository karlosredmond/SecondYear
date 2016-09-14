package Practice;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.*;


public class HospitalFiles extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container content;
	private JLabel getInFileLabel;
	private JLabel getOutFileLabel;
	private JPanel panel1,panel1a,panel1b;

	private JPanel panel2,panel2a,panel2b;
	private JPanel panel3,panel3a,panel3b;
	private JPanel panel4;
	private JLabel inPatientsLabel;
	private JLabel outPatientsLabel;
	private JLabel wardDropLabel;
	private JLabel dateLabel;
	private JLabel patientLabel;
	private JLabel wardLabel;
	private JButton getData;
	private JButton send,sortType,sortWard,clear;
	private JTextArea textArea;
	private JTextField patientText;
	private JTextField wardText;
	private JTextField dateText;
	private JTextField inputFileText ;
	private JTextField outputFileText; 
	private JScrollPane textScroll;
	private ArrayList<String> rows ;
	private String[] wards = {"St.Marks", "St.Marys","Day","Lukes","St.Davids","Matthew"};
	private int wardCount;
	private String inputLine,wardDetails="",patientType = "";
	private JComboBox<String> inPatientsBox;
	private JComboBox<String> outPatientsBox;
	private JComboBox<?> wardsBox;
	private Scanner scan1;
	private BufferedWriter out;
	
	public HospitalFiles()
	{
		super("Hospital Files");
		
		content =	getContentPane();
		panel1 = new JPanel();
		panel1a = new JPanel();
		panel1b = new JPanel();
		panel2 = new JPanel();
		panel2a = new JPanel();
		panel2b = new JPanel();
		panel3 = new JPanel();
		panel3a = new JPanel();
		panel3b = new JPanel();
		getInFileLabel = new JLabel("Enter Input File");
		getOutFileLabel = new JLabel("Enter Output File");
		inPatientsLabel = new JLabel("In Patients");
		outPatientsLabel = new JLabel("Out Patients");
		wardDropLabel = new JLabel("Select Ward");
		dateLabel = new JLabel("Select Date");
		patientLabel = new JLabel("Patient");
		wardLabel = new JLabel("Ward");
		patientText = new JTextField("",10);
		wardText = new JTextField("",10);
		dateText = new JTextField("",10);
		inputFileText = new JTextField("",15);
		outputFileText = new JTextField("",15);
		textArea = new JTextArea(5,40);
		inPatientsBox = new JComboBox<String>();
		outPatientsBox = new JComboBox<String>();
		wardsBox = new JComboBox(wards);
		getData = new JButton("Get Files");
		send = new JButton("Send Files");
		sortType = new JButton("Sort Type");
		sortWard = new JButton("Sort Ward");
		clear = new JButton("Clear");
		rows = new ArrayList<String>() ;
		setLayout(new BorderLayout());
		
		
		
		
		 textScroll = new JScrollPane (textArea,  JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				 JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	
	
		panel1b.setLayout(new BorderLayout());
		panel2b.setLayout(new BorderLayout());
		panel3b.setLayout(new BorderLayout());
		patientText.setEditable(false);
		wardText.setEditable(false);
		dateText.setEditable(true);
		panel1.add(getInFileLabel);
		panel1.add(inputFileText);
		panel1.add(getOutFileLabel);
		panel1.add(outputFileText);
		panel1.add(getData);
		panel1a.add(inPatientsLabel);
		panel1a.add(inPatientsBox);
		panel1a.add(outPatientsLabel);
		panel1a.add(outPatientsBox);
		panel1a.add(wardDropLabel);
		panel1a.add(wardsBox);
		panel1b.add(panel1,"North");
		panel1b.add(panel1a,"South");
		panel2.add(dateLabel);
		panel2.add(dateText);
		panel2.add(patientLabel);
		panel2.add(patientText);
		panel2.add(wardLabel);
		panel2.add(wardText);
		panel2.add(send);
		panel2a.add(sortType);
		panel2a.add(sortWard);
		panel2b.add(panel2,"North");
		panel2b.add(panel2a,"South");
		panel3.add(textScroll);
		panel3a.add(clear,"South");
		panel3b.add(panel3,"North");
		panel3b.add(panel3a,"South");
		content.add(panel1b,"North");
		//content.add(panel1a,"Center");
		content.add(panel2b,"Center");
		//add(wardText,"North");
		content.add(panel3b,"South");
		pack();
		inPatientsBox.addActionListener(this);
		outPatientsBox.addActionListener(this);
		wardsBox.addActionListener(this);
		getData.addActionListener(this);
		send.addActionListener(this);
		sortType.addActionListener(this);
		clear.addActionListener(this);
		sortWard.addActionListener(this);
		addWindowListener(new WindowAdapter(){
	           public void windowClosing(WindowEvent e)
	           {
	        	   System.exit(0);
	           }
	          });
		
	}
	public void clear()
	{
		textArea.setText("");
	}
	

	public static void main(String args[])
	{
		HospitalFiles h = new HospitalFiles();
		
		h.setVisible(true);
		//h.setSize(550, 200);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if(e.getSource()==getData)
		{
			String inputFile = inputFileText.getText();
			String outputFile = outputFileText.getText();
			//"F://Year2//O.O.P//CA2//in.dat"
			//"F://Year2//O.O.P//CA2//out.dat"
			try 
			{
				scan1 = new Scanner(new File(inputFile));
				while(scan1.hasNextLine())
				{
					inPatientsBox.addItem(scan1.nextLine());
				}
				inputFileText.setEditable(false);
				scan1 = new Scanner(new File(outputFile));
				while(scan1.hasNextLine())
				{
					outPatientsBox.addItem(scan1.nextLine());
				}
				outputFileText.setEditable(false);
			} 
			catch (FileNotFoundException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == inPatientsBox){
			patientText.setText((String)inPatientsBox.getSelectedItem());
			patientType = "In_Patient" ;
		}
		else if(e.getSource() == outPatientsBox){
			patientText.setText((String)outPatientsBox.getSelectedItem()); 
			patientType = "Out_Patient" ;
		}
		else if(e.getSource() == wardsBox)
		{	
			
			if(wardCount < 3){
			String wardList = (String)wardsBox.getSelectedItem() ;
			wardDetails = wardDetails + " " +  wardList ;
			
			wardsBox.removeItem(wardList);
			wardText.setText(wardDetails); 
			wardCount++ ;
			}
			
	//or (int i = 0; i <6; i++) {
		                                     //here you can give your combo the number of index
	//               wardsBox.setSelectedIndex(0);
	//               wardsBox.insertItemAt(wards[1],i);
	//           }
		}
		else if(e.getSource()==send)
		{
			try {
			//ardsBox = new JComboBox(wards);
				out = new BufferedWriter(new FileWriter("F://Year2//O.O.P//CA2//all.txt",true));
				out.write(patientType + " " + patientText.getText() + " " + wardDetails + " " + dateText.getText()) ;
				out.newLine();
				out.close();
				patientText.setText("") ;
				wardDetails = "" ;
				wardText.setText("");
				dateText.setText("") ;
				patientType = "" ;
				wardCount = 0;
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
			}
		}
		else if(e.getSource() == sortType)
		{
				try
				{
					scan1 = new Scanner(new File("F://Year2//O.O.P//CA2//all.txt")) ;
					String s ;
					rows.clear();
					while(scan1.hasNextLine())
					{
						
						textArea.setText("");
						s= scan1.nextLine();
						rows.add(s) ;
						Collections.sort(rows);
						String[] arr = rows.toArray(new String[0]) ;
						for(String cur : arr)
						{
							textArea.append(cur);
							textArea.append("\n") ;
						}
					}
				}
				catch (FileNotFoundException e1)
				{
					// TODO Auto-generated catch block
				}
		}
		else if(e.getSource() == clear)
		{
			textArea.setText("");
			patientText.setText("");
			wardText.setText("");
			dateText.setText("");
		}
		else if(e.getSource() == sortWard)
		{
			try
			{
				scan1 = new Scanner(new File("F://Year2//O.O.P//CA2//all.txt")) ;
	//clear();
				while(scan1.hasNext())
				{
					
	//		textArea.setText("");
					scan1.next();
					scan1.next();
					String	s= scan1.next();
				//ows.add(s) ;
				//ollections.sort(rows);
				//tring[] arr = rows.toArray(new String[0]) ;
				//or(String cur : arr)
				//
						textArea.append(s);
						textArea.append("\n") ;
				
				}
				//xtArea.setText(theWard);
			}
			catch (FileNotFoundException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
				
		
	}
}
