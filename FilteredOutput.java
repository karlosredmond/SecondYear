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
class FilteredOutput extends Frame implements ActionListener{
  Button btnWriteFile;
  TextField txtNumber, txtFileName;
  TextArea areaNums;
  public FilteredOutput(){
         addWindowListener(new WindowAdapter(){
        	public void windowClosing(WindowEvent e){
                System.exit(0);}});
         setSize(400, 200);
         setTitle("File Reader");
         setLayout(new FlowLayout());
         setBackground(Color.lightGray);
         btnWriteFile=new Button("Generate Numbers");
         txtFileName=new TextField(20);
         txtNumber=new TextField(20);
         areaNums=new TextArea(6,30);
         add(new Label("Number of Numbers to Generate"));
         add(txtNumber);
         add(new Label("FileName"));
         add(txtFileName);
         add(btnWriteFile);
         add(areaNums);
         btnWriteFile.addActionListener(this);
	}
  public void actionPerformed(ActionEvent e){

    DataOutputStream os=null;
    String s="",filename=txtFileName.getText();
    try{
      os=new DataOutputStream(new FileOutputStream(filename));
      int num=Integer.parseInt(txtNumber.getText());
      double data;
      for(int i=0;i<num;i++){
        data=Math.random()*1000;
        os.writeDouble(data);
        s=s+data+'\n';
      }
    areaNums.setText("The following numbers were written to file\n"+s);
    }
    catch(IOException ex){
      txtFileName.setText(ex.getMessage());
    }
    finally{
      try{
        if(os!=null)
          os.close();
      }
      catch(Exception ex){}
    }
  }
}