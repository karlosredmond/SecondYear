package Lab7;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

/**
 * @author David
 *
 */
public class david extends JFrame implements ActionListener {

	//Variables
	private TextArea textArea;
	private MenuBar menuBar; //Menu bar item
	private Menu file; //File menu item
	//File menu items
	private MenuItem openFile; //Open option
	private MenuItem saveFile; //Save option
	private MenuItem close; //Close option
	
	//Constructor
	public david() {
		setSize(500, 300); //Initial size of the window frame
		setTitle("Java Notepad"); //Set title
		WindowCloser listener = new WindowCloser();
		addWindowListener(listener);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE); //set the default close operation (exit when it gets closed)
		
		textArea = new TextArea("", 0,0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textArea.setFont(new Font("Century Gothic", Font.BOLD, 12)); // set a default font for the TextArea
		// this is why we didn't have to worry about the size of the TextArea!
		getContentPane().setLayout(new BorderLayout()); // the BorderLayout bit makes it fill it automatically
		getContentPane().add(textArea); //Add text area to content pane
		
		// add our menu bar into the GUI
		menuBar = new MenuBar();
		file = new Menu();
		openFile = new MenuItem();
		saveFile = new MenuItem();
		close = new MenuItem();
		
		setMenuBar(menuBar);
		menuBar.add(file); // we'll configure this later
		
		file.setLabel("File");
		
		// OPEN option
		this.openFile.setLabel("Open"); // set the label of the menu item
		this.openFile.addActionListener(this); // add an action listener (so we know when it's been clicked
		this.openFile.setShortcut(new MenuShortcut(KeyEvent.VK_O, false)); // set a keyboard shortcut
		this.file.add(this.openFile); // add it to the "File" menu
 
		// SAVE option
		this.saveFile.setLabel("Save");
		this.saveFile.addActionListener(this);
		this.saveFile.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
		this.file.add(this.saveFile);
 
		// CLOSE option
		this.close.setLabel("Close");
		// along with our "CTRL+F4" shortcut to close the window, we also have
		// the default closer, as stated at the beginning of this tutorial.
		// this means that we actually have TWO shortcuts to close:
		// 1) the default close operation (example, Alt+F4 on Windows)
		// 2) CTRL+F4, which we are about to define now: (this one will appear in the label)
		this.close.setShortcut(new MenuShortcut(KeyEvent.VK_F4, false));
		this.close.addActionListener(this);
		this.file.add(this.close);
		
		
	}
	//Action Listener
	public void actionPerformed(ActionEvent e) {
			// if the source of the event was our "close" option
			if (e.getSource() == this.close){
				this.dispose(); // dispose all resources and close the application
			}
			// if the source was the "open" option
			else if (e.getSource() == this.openFile) {
			JFileChooser open = new JFileChooser(); // open up a file chooser (a dialog for the user to browse files to open)
			int option = open.showOpenDialog(this); // get the option that the user selected (approve or cancel)
			// NOTE: because we are OPENing a file, we call showOpenDialog~
			// if the user clicked OK, we have "APPROVE_OPTION"
			// so we want to open the file
				if (option == JFileChooser.APPROVE_OPTION) {
					this.textArea.setText(""); // clear the TextArea before applying the file contents
					try {
						// create a scanner to read the file (getSelectedFile().getPath() will get the path to the file)
						Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
						while (scan.hasNext()){ // while there's still something to read
							this.textArea.append(scan.nextLine() + "\n"); // append the line to the TextArea
						}
					} 
					catch (Exception ex) { // catch any exceptions, and...
							// ...write to the debug console
							System.out.println(ex.getMessage());
						}
				}
			}
				// and lastly, if the source of the event was the "save" option
				else if (e.getSource() == this.saveFile) {
					JFileChooser save = new JFileChooser(); // again, open a file chooser
					int option = save.showSaveDialog(this); // similar to the open file, only this time we call
					// showSaveDialog instead of showOpenDialog
					// if the user clicked OK (and not cancel)
					if (option == JFileChooser.APPROVE_OPTION) {
						try {
							// create a buffered writer to write to a file
							BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
							out.write(this.textArea.getText()); // write the contents of the TextArea to the file
							out.close(); // close the file stream
						} catch (Exception ex) { // again, catch any exceptions and...
							// ...write to the debug console
							System.out.println(ex.getMessage());
						}
					}
				}			
	}
	private class WindowCloser extends WindowAdapter{
		public void windowClosing(WindowEvent event){
			System.exit(0);
		}

	}
	public static void main(String[]args){
		david d = new david() ;
		d.setVisible(true);
	}
}
