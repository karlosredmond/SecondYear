	/** Student No: 	C00196815
	 *  Student Name: 	Karl Redmond
	 *  Description: 	CA 2 
	 * 
	 */
package Practice;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class BasicFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton button1,button2,button3 ;
	private JPanel panel1,panel2,panel3 ;
	private JTextField text1,text2,text3 ;
	private JTextArea textarea;
	private Container contentPane ;
	public BasicFrame() {
		// TODO Auto-generated constructor stub
        addWindowListener(new WindowAdapter(){
       	public void windowClosing(WindowEvent e){
               System.exit(0);}});
        setSize(400,400) ;
        setTitle("Exam") ;
        contentPane = getContentPane() ; 
        contentPane.setLayout(new BorderLayout(10,10));
        panel1 =new JPanel() ;
        panel2 =new JPanel() ;
        panel1.add(text1 = new JTextField(10)) ;
        panel1.add(button1 = new JButton("Open File")) ;
        panel2.add(button2 = new JButton("Append")) ;
        panel2.add(button3 = new JButton("Save")) ;
        contentPane.add(textarea = new JTextArea(1,40),"Center") ;
        contentPane.add(panel1,"North") ;
        contentPane.add(panel2,"South") ;
        textarea.setEditable(true);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = "" ,c;
		if(e.getSource() == button1){
			BufferedReader file_in = null;
			s=text1.getText();
			try {
				file_in = new BufferedReader(new FileReader(s));//Reads a file
				s = "" ;
				c = file_in.readLine() ;
				while(c != null){
					s +=c + "\n";
					c = file_in.readLine() ;
				}
			s.trim();
			textarea.setText(s) ;
			super.pack() ;
			} 
			catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			text1.setText("File not Found") ;
			} 
			catch (IOException e1) {
			// TODO Auto-generated catch block
			}
		    finally{
		        try{
		          if(file_in !=null)
		            file_in.close();
		        }
		        catch(Exception ex){}
		      }
		}
		else if(e.getSource() == button2){
			s = text1.getText() ;
			BufferedWriter out = null;
			try {
				out = new BufferedWriter(new FileWriter(s,true)); //the boolean (true) indicates that you want to append
				s=textarea.getText() ;
				s.trim();
				out.write(s + "\n") ;
			} 
			catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			text1.setText("File not Found") ;
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
		else if(e.getSource() == button3){
			s = text1.getText() ;
			BufferedWriter out = null;
			try {
				out = new BufferedWriter(new FileWriter(s));// Writes to a new File
				s=textarea.getText() ;
				s.trim();
				out.write(s + "\n") ;
			} 
			catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			text1.setText("File not Found") ;
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
	}
	public static void main(String args[]){
		BasicFrame f = new BasicFrame() ;
		f.setVisible(true);	
	}
}
