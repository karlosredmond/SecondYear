package Practice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

public class Practice extends JFrame implements ActionListener{
	private JTextArea textArea;
	private JLabel name,wards,date,patientType,wardAtt ;
	private BufferedWriter out ;
	private JButton inPatients,outPatients ,addPatient;
	private JTextField nameText,wardsAttText,dateText;
	private File in,outP,appendF ;
	private JComboBox selectWard,patientTypeSelect ;
	private String[] wardsDrop =  {"Mary","Mark","Luke","John","Matthew","Jesus"} ;
	private String[] patientDrop =  {"In", "Out"} ;
	private JPanel panel1,panel2 ;
	private Container contentPane ;
	public Practice() {
		// TODO Auto-generated constructor stub
		setSize(550,500);
		setResizable(false) ;
		textArea = new JTextArea(15,30) ;
		contentPane = getContentPane() ;
		contentPane.add(textArea,"Center") ;
		name = new JLabel("Name") ;
		wards = new JLabel("Wards") ;
		date = new JLabel("Date") ;
		patientType = new JLabel("Patient Type") ;
		wardAtt = new JLabel("Wards Attending") ;
		nameText = new JTextField(10) ;
		wardsAttText = new JTextField(10) ;
		dateText = new JTextField(10) ;
		inPatients = new JButton("In Patient") ;
		outPatients = new JButton("Out Patient") ; 
		addPatient = new JButton("Add Patient") ;
		selectWard = new JComboBox(wardsDrop) ;
		patientTypeSelect = new JComboBox(patientDrop) ;
		panel1 = new JPanel() ;
		panel2 = new JPanel() ;
		in = new File("CHin_Patients.dat") ;
		outP = new File("CHout_Patients.dat") ;
		appendF = new File("All_Patients.dat") ;
		panel1.setLayout(new FlowLayout()) ;
		panel1.add(name);
		panel1.add(nameText);
		panel1.add(wards);
		panel1.add(selectWard);
		panel1.add(date);
		panel1.add(dateText);
		panel1.add(patientType);
		panel1.add(patientTypeSelect);
		panel1.add(wardAtt);
		panel1.add(wardsAttText);
		panel2.add(inPatients) ;
		panel2.add(outPatients) ;
		panel2.add(addPatient) ;
		contentPane.add(panel1,"North") ;
		contentPane.add(panel2,"South") ;
		inPatients.addActionListener(this) ;
		outPatients.addActionListener(this) ;
		addPatient.addActionListener(this) ;
		addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		           System.exit(0);}});	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 String s="";
		if(e.getSource() == inPatients){
			if(in.exists()){
			    Scanner infile=null;
			    try{
			      infile=new Scanner(in);
			      while(infile.hasNextLine()){
			        s = s + infile.nextLine() + "\n";
			      }
			      textArea.setText(s);
			    }
			    catch(FileNotFoundException ex){
			      textArea.setText("File Not found:");
			    }
			    catch(IOException ex){
			      textArea.setText(ex.getMessage());
			    }
			}
			else{
				s= "Cannot find file" ;
				textArea.setText(s) ;
			}
		}
		else if(e.getSource() == outPatients){
			if(outP.exists()){
			    Scanner infile=null;
			    try{
			      infile=new Scanner(outP);
			      while(infile.hasNextLine()){
			        s = s + infile.nextLine() + "\n";
			      }
			      textArea.setText(s);
			    }
			    catch(FileNotFoundException ex){
			      textArea.setText("File Not found:");
			    }
			    catch(IOException ex){
			      textArea.setText(ex.getMessage());
			    }
			}
		}
		else if(e.getSource() == addPatient){
			String file = "" ;
			String p = file ;
			if((String)patientTypeSelect.getSelectedItem() == "Out"){
				file = "CHout_Patients.dat" ;
			    p = "Out_Patient" ; 
			}
			else{
				file = "CHin_Patients.dat" ;
				p = "In_Patient" ;
			}
			try {
				out = new BufferedWriter(new FileWriter(file,true));
				out.write(p + " " + nameText.getText() + "  " + date.getText() + wardsAttText.getText() + "\n") ;
				out.close();
				nameText.setText("") ;
				dateText.setText("") ;
				
			} 
			catch (IOException e1) {
				// TODO Auto-generated catch block
			}
		}
		
	}
	public static void main(String args[]){
		Practice p = new Practice() ;
		p.setVisible(true);
		p.pack();
		
	}

}
