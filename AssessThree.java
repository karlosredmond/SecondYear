	/** Student No: 	C00196815
	 *  Student Name: 	Karl Redmond
	 *  Description: 	CA 3 
	 * 
	 */
package AssessThree;
//reference libraries 

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class AssessThree extends JFrame implements ActionListener {
	//variables with class scope
	private static final long serialVersionUID = 1L;
	private JButton button2,button3 ;
	private JPanel panel1,panel2,panel3,panel4 ;
	private JScrollPane scroll ;
	private JTextField dateText;
	private JComboBox<String> homeDrop,awayDrop,homeScoreDrop,awayScoreDrop ;
	private String[] scoreDrop = {"0","1","2","3","4","5","6","7","8","9","10"} ;
	private String s = "";
	private JTextArea textarea;
	private Container contentPane ;
	//Consructor
	public AssessThree() {//Bulid Frame
        addWindowListener(new WindowAdapter(){
       	public void windowClosing(WindowEvent e){
               System.exit(0);}});
        setSize(300,300) ;
        setTitle("Carlow Soccer League") ;
        contentPane = getContentPane() ; 
        contentPane.setLayout(new BorderLayout(30,30));
        textarea = new JTextArea(10,40) ;
        scroll = new JScrollPane(textarea) ;  
        panel1 =new JPanel() ;
        panel2 =new JPanel() ;
        panel3 = new JPanel() ;
        panel4 = new JPanel() ;
        panel1.setLayout(new BorderLayout(10,10)) ;
        panel3.add(new JLabel("Home")) ;
        panel3.add(homeDrop = new JComboBox<String>()) ;
        panel3.add(new JLabel("Away")) ;
        panel3.add(awayDrop = new JComboBox<String>()) ;
        panel3.add(new JLabel("Date")) ;
        panel3.add(dateText = new JTextField(10)) ;
        panel1.add(panel2,"South") ;
        panel2.add(new JLabel("Home Score")) ;
        panel2.add(homeScoreDrop = new JComboBox<String>(scoreDrop)) ;
        panel2.add(new JLabel("AwayScore")) ;
        panel2.add(awayScoreDrop = new JComboBox<String>(scoreDrop)) ;
        panel1.add(panel3,"Center") ;
        homeDrop.addActionListener(this) ;
        awayDrop.addActionListener(this) ;
        panel4.add(button2 = new JButton("Add Result")) ;
        panel4.add(button3 = new JButton("Home Wins")) ;
        contentPane.add(scroll,"Center") ;
        contentPane.add(panel1,"North") ;
        contentPane.add(panel4,"South") ;
        textarea.setEditable(false);
        button2.addActionListener(this);
        button3.addActionListener(this);
        homeScoreDrop.setSelectedItem("0") ;
        awayScoreDrop.setSelectedItem("0") ;
		homeDrop.addActionListener(this);
		awayDrop.addActionListener(this);
        displayFile() ; //Fills Combo Boxes
        displayResults() ;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button2){ //Add Result
			BufferedWriter out = null;
			textarea.setText(textarea.getText() + (String)homeDrop.getSelectedItem() + " " + (String)homeScoreDrop.getSelectedItem() + " " + (String)awayDrop.getSelectedItem() + " " + (String)awayScoreDrop.getSelectedItem() + " " + dateText.getText() + "\n") ;
			try {
				out = new BufferedWriter(new FileWriter("Results.dat",true)); //the boolean (true) indicates that you want to append
				s = "" + (String)homeDrop.getSelectedItem() + " " + (String)homeScoreDrop.getSelectedItem() + " " + (String)awayDrop.getSelectedItem() + " " + (String)awayScoreDrop.getSelectedItem() + " " + dateText.getText();
				out.write(s + "\n") ;
				dateText.setText("") ;
				awayDrop.removeAllItems();
				homeDrop.removeAllItems();
				displayFile() ;
			} 
			catch (FileNotFoundException e1) {

			} 
			catch (IOException e1) {
				// TODO Auto-generated catch block
			}
		    finally{
		        try{
		          if(out !=null)
		            out.close();
		        }
		        catch(Exception ex){}
		      }
		}
		else if(e.getSource() == homeDrop){
			awayDrop.removeItem((String)homeDrop.getSelectedItem());
		}
		else if(e.getSource() == button3){
			BufferedReader file_in = null;
			String c = "" ;
		try {
			file_in = new BufferedReader(new FileReader("Results.dat"));//Reads a file
			s = "" ;
			c = file_in.readLine() ;
			while(c != null){// adds line to string while file has another line
				// Could put code here to isolate scores using tokenizer and compare them. Dont have time
				//could change the input string to have home score first, away score second then home team third
				c = file_in.readLine() ;
			}
			s.trim();
			textarea.setText(s) ; //Sets text area to contents of string s.
			} 
			catch (FileNotFoundException e1) {
			} 
			catch (IOException e1) {
			}
		    finally{
		        try{
		          if(file_in !=null)
		            file_in.close();
		        }
		        catch(Exception ex){}
		      }
		}
	}
	public void displayFile(){
		BufferedReader file_in = null;
		String c = "" ;
	try {
		file_in = new BufferedReader(new FileReader("CSLteams.dat"));//Reads a file
		s = "" ;
		c = file_in.readLine() ;
		while(c != null){// adds line to string while file has another line
			homeDrop.addItem(c) ;
			awayDrop.addItem(c) ;
			s += c + "\n";
			c = file_in.readLine() ;
		}
        homeDrop.setSelectedItem("St Josephs") ;
        awayDrop.setSelectedItem("St Josephs") ;
		s.trim();
		} 
		catch (FileNotFoundException e1) {
		} 
		catch (IOException e1) {
		}
	    finally{
	        try{
	          if(file_in !=null)
	            file_in.close();
	        }
	        catch(Exception ex){}
	      }
	}
	public void displayResults(){
		BufferedReader file_in = null;
		String c = "" ;
	try {
		file_in = new BufferedReader(new FileReader("Results.dat"));//Reads a file
		s = "" ;
		c = file_in.readLine() ;
		while(c != null){// adds line to string while file has another line
			s += c + "\n";
			c = file_in.readLine() ;
		}
		s.trim();
		textarea.setText(s) ; // set Text area to value of String
		} 
		catch (FileNotFoundException e1) {
		} 
		catch (IOException e1) {
		}
	    finally{
	        try{
	          if(file_in !=null)
	            file_in.close();
	        }
	        catch(Exception ex){}
	      }
	}
	public static void main(String args[]){
		AssessThree f = new AssessThree() ;
		f.setVisible(true);	
		f.pack();
	}
}
