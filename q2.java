package Lab6;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class q2 extends Frame implements ActionListener {
 	private TextField name,greeting;
 	private Button myButton;
 	private Label nameLabel;

	public q2(){
	setSize(600,400) ;
	setTitle("My Message Box");
	setBackground(Color.lightGray);
    setVisible(true);
    setLayout(new FlowLayout());
    myButton=new Button("OK");
    nameLabel = new Label("Hello") ;
    name=new TextField(10);
    add(nameLabel) ;
	add(myButton);
	myButton.addActionListener(this);
	addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
	           System.exit(0);}});


	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		}
	
	public static void main(String args[]){
	q2 frame  = new q2() ;
	
	}
}
