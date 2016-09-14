package Lab6;

import java.awt.*;
import java.awt.event.*;


public class MyFrame extends Frame implements ActionListener {
 	private TextField name,greeting;
 	private Button myButton;
 	private Label nameLabel;

	private MyFrame(){
	setSize(400,400) ;
	setTitle("This is My Frame");
	setBackground(Color.lightGray);
    setVisible(true);
    setLayout(new FlowLayout());
    myButton=new Button("Press Me");
    nameLabel = new Label("Enter Name") ;
    name=new TextField(10);
    greeting=new TextField(20);
    add(nameLabel) ;
    add(name);
	add(myButton);
	add(greeting);
	myButton.addActionListener(this);
	addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
	           System.exit(0);}});


	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== myButton){
		String n;
        n="Hello "+ name.getText();
        greeting.setText(n);
		}
		
	}
	public static void main(String args[]){
	MyFrame frame  = new MyFrame() ;
	
	}
}
