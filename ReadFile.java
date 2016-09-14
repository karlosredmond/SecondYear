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
class ReadFile extends Frame implements ActionListener{
  Button btnReadFile;
  TextField txtFileName;
  TextArea areaFileContents;
  public ReadFile(){
         addWindowListener(new WindowAdapter(){
        	public void windowClosing(WindowEvent e){
                System.exit(0);}});
         setSize(400, 400);
         setTitle("File Reader");
         setLayout(new FlowLayout());
         setBackground(Color.lightGray);
         btnReadFile=new Button("ReadFile");
         txtFileName=new TextField(20);
         areaFileContents=new TextArea(10,40);
         add(new Label("FileName"));
         add(txtFileName);
         add(btnReadFile);
         add(areaFileContents);
         btnReadFile.addActionListener(this);
	}
  public void actionPerformed(ActionEvent e){

    FileInputStream infile=null;
    String s="";
    try{
      infile=new FileInputStream(txtFileName.getText());
      int c;
      c=infile.read();
      while(c!=-1){
        s+=(char)c;
        c=infile.read();
      }
      areaFileContents.setText(s);
    }
    catch(FileNotFoundException ex){
      areaFileContents.setText("File Not found:"+txtFileName.getText());
    }
    catch(IOException ex){
      areaFileContents.setText(ex.getMessage());
    }
    finally{
      try{
        if(infile!=null)
          infile.close();
      }
      catch(Exception ex){}
    }
  }
}
