package Lab10;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2008
 * Company:
 * @author Greg Doyle
 * @version 1.0
 */
class FilteredInput extends Frame implements ActionListener{
  Button btnReadFile;
  TextField txtNumber, txtFileName;
  TextArea areaNums;
  public FilteredInput(){
         addWindowListener(new WindowAdapter(){
        	public void windowClosing(WindowEvent e){
                System.exit(0);}});
         setSize(400, 200);
         setTitle("File Reader");
         setLayout(new FlowLayout());
         setBackground(Color.lightGray);
         btnReadFile=new Button("ReadFile");
         txtFileName=new TextField(20);
         txtNumber=new TextField(20);
         areaNums=new TextArea(6,30);
         add(new Label("FileName"));
         add(txtFileName);
         add(btnReadFile);
         add(areaNums);
         btnReadFile.addActionListener(this);
	}
  public void actionPerformed(ActionEvent e){

    DataInputStream is=null;
    String s="",filename=txtFileName.getText();
    try{
      is=new DataInputStream(new FileInputStream(filename));
      double data;
      while(true){
        data=is.readDouble();
        s=s+data+'\n';
      }

    }
    catch(IOException ex){
      txtFileName.setText(ex.toString());
    }
    finally{
      try{
        is.close();
      }
      catch(Exception ex){}
    }
    areaNums.setText("The following numbers were read from file "+ filename + "\n" + s);

  }
}