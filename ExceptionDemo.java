package Lab10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2008
 * Company:
 * @author Greg Doyle
 * @version 1.0
 */


class ExceptionDemo extends Frame implements ActionListener{
  Button myButton;
  TextField tfNum1,tfNum2,tfResult;
  public ExceptionDemo(){
         addWindowListener(new WindowAdapter(){
        	public void windowClosing(WindowEvent e){
                System.exit(0);}});
         setSize(400, 200);
         setTitle("This is My Frame");
         setLayout(new FlowLayout());
         setBackground(Color.lightGray);
         myButton=new Button("Add");
         tfNum1=new TextField(5);
         tfNum2=new TextField(5);
         tfResult=new TextField(30);
         add(tfNum1);
         add(tfNum2);
         add(myButton);
         add(tfResult);
         myButton.addActionListener(this);
	}
  public void actionPerformed(ActionEvent e){
         String n;
         float a,b,c;
         try{
           n=tfNum1.getText();
           a=Float.parseFloat(n);
           n=tfNum2.getText();
           b=Float.parseFloat(n);
           c=a+b;
           n=""+c;
           tfResult.setText(n);
          }
          catch(NumberFormatException ex){
            String msg=ex.getMessage()+" is not a float";
            String exception=ex.toString();
            JOptionPane.showMessageDialog(null,msg,exception,3);
          }                            
  }

}