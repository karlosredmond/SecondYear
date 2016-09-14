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
class WriteFile extends Frame implements ActionListener{
  Button btnReadFile;
  TextField txtFileName;
  TextArea areaFileContents;
  public WriteFile(){
         addWindowListener(new WindowAdapter(){
        	public void windowClosing(WindowEvent e){
                System.exit(0);}});
         setSize(400, 400);
         setTitle("File Reader");
         setLayout(new FlowLayout());
         setBackground(Color.lightGray);
         btnReadFile=new Button("WriteFile");
         txtFileName=new TextField(20);
         areaFileContents=new TextArea(10,40);
         add(areaFileContents);
         add(new Label("FileName"));
         add(txtFileName);
         add(btnReadFile);
         btnReadFile.addActionListener(this);
	}
  public void actionPerformed(ActionEvent e){

    FileOutputStream outfile=null;
    String s="",filename;
    byte[] b;
    //check if file already exists
    filename=txtFileName.getText();
    File f=new File(filename);
    if(f.exists()){
      txtFileName.setText("File Exists:"+filename);
      return;
    }
    try{
      outfile=new FileOutputStream(filename);
      b=areaFileContents.getText().getBytes();
      outfile.write(b);
    }
    catch(FileNotFoundException ex){
      areaFileContents.setText("File Not found:"+filename);
    }
    catch(IOException ex){
      areaFileContents.setText(ex.getMessage());
    }
    finally{
      try{
        if(outfile!=null)
          outfile.close();
      }
      catch(Exception ex){}
    }
  }
  public static void main(String[]args){
	  WriteFile f = new WriteFile() ;
	  f.setVisible(true) ;
  }
}