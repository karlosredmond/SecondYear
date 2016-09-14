package Lab7;

	import java.awt.event.WindowEvent;
	import javax.swing.JFrame;
	import javax.swing.JPanel; 
	import javax.swing.JTextField; 
	import java.awt.Graphics; 
	import java.awt.Color;
	import java.awt.Container;
	import java.awt.event.ActionListener; 
	import java.awt.event.ActionEvent; 

	public class OvalTest
	{
		
	public static void main(String args[]) 
	{
	OvalFrame frame = new OvalFrame(); 
	frame.setTitle("Enter circle radius:"); 
	frame.setVisible(true);
	}
	}


	class OvalFrame extends JFrame
	{
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private JTextField textField; 
	private OvalPanel panel; 

	public OvalFrame()
	{
	final int DEFAULT_FRAME_WIDTH = 300; 
	final int DEFAULT_FRAME_HEIGHT = 300; 
	setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT); 

	// construct components
	OvalPanel panel = new OvalPanel(); 
	textField = new JTextField(); 
	// add textField listener 
	textField.addActionListener(new TextFieldListener()); 

	Container contentPane = getContentPane();
	// add TextField to panel 
	contentPane.add(textField,"South");
	contentPane.add(panel, "Center"); 
	WindowCloser listener = new WindowCloser(); 
	addWindowListener(listener);
	}


	private class TextFieldListener implements ActionListener 
	{
	public void actionPerformed(ActionEvent event)
	{	// get user input
	String input = textField.getText(); 
	// process user input 
	panel.setOvals(Integer.parseInt(input)); 
	// clear text field
	textField.setText("");
			}

	}// 
	private class WindowCloser extends java.awt.event.WindowAdapter 
	{
	public void windowClosing(WindowEvent event) 
	{ System.exit(0); }
	}

	}//end class OvalFrame

	class OvalPanel extends JPanel 
	{
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	private int ovals;
	private static final int OVALWIDTH = 30; 
	private static final int OVALHEIGHT = 50; 

	public void paintComponent(Graphics g)
	{
	super.paintComponent(g); 
	g.setColor(Color.black); 
	for (int i = 0; i < ovals; i++)
	{
	int x = (int) (Math.random() * getWidth() + 1); 
	int y = (int) (Math.random() * getHeight() + 1); g.drawOval(x, y, OVALWIDTH, OVALHEIGHT);
			}
	} //end paintComponent() 

	public void setOvals(int o) 
	{
	ovals = o;
	repaint();
	}
	} 


