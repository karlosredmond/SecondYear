package Lab7;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class NotePad extends JFrame implements ActionListener{
	private final int DEFAULT_WIDTH = 600 ;
	private final int DEFAULT_HEIGHT = 700 ;
	private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
	private Font font1 ;
	private JTextArea textArea ;
	private JMenuBar menuBar ;
	private JMenu file,edit,format,view,help ;
	private JMenuItem New,open,save,saveAs ;
	public NotePad() {
		// TODO Auto-generated constructor stub
		Container contentPane = getContentPane() ;
		font1 = new Font("Monotype", Font.BOLD, 25);
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT) ;
		setBackground("white") ;
		setTitle("Worth A Shot") ;
		textArea = new JTextArea() ;
		menuBar = new JMenuBar() ;
//***********************************JMENU FILE****************************************************		
		file = new JMenu("File") ;
		file.setFont(font1) ;
		New = new JMenuItem("New") ;
		open= new JMenuItem("Open") ;
		save = new JMenuItem("Save") ;
		saveAs = new JMenuItem("SaveAs") ;
		saveAs.addActionListener(this) ;
		file.add(New) ;
		file.add(open) ;
		file.add(save) ;
		file.add(saveAs) ;
//**************************************JMenu Edit*********************************************		
		edit = new JMenu("Edit") ;
		edit.setFont(font1) ;
		format = new JMenu("Format") ;
		format.setFont(font1) ;
		view = new JMenu("View") ;
		view.setFont(font1) ;
		help = new JMenu("Help") ;
		help.setFont(font1) ;
		menuBar.add(file) ;
		menuBar.add(edit) ;
		menuBar.add(format) ;
		menuBar.add(view) ;
		menuBar.add(help) ;
		contentPane.add(menuBar,"North") ;
		contentPane.add(textArea) ;	
		addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		           System.exit(0);}});
	}
private void setBackground(String string) {
		// TODO Auto-generated method stub
		
	}
public static void main (String[]args){
	NotePad n = new NotePad() ;
	n.setVisible(true) ;

}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == saveAs){
		}
		
	}
	private void saveFileAs() {
		// TODO Auto-generated method stub
		
	}

}
