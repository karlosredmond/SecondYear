package Lab7;

import java.awt.event.WindowEvent; 
import javax.swing.JFrame;
import javax.swing.JPanel; 
import java.awt.Graphics; 
import java.awt.Color; 
import java.awt.Container; 

public class CompleteFrame 
{
public static void main(String args[]) 
{
MyFrame frame = new MyFrame(); 
frame.setTitle("Close me!"); 
frame.setVisible(true);
	}
}
class MyFrame extends JFrame 
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public MyFrame()
{
final int DEFAULT_FRAME_WIDTH = 300;
final int DEFAULT_FRAME_HEIGHT = 300; 
setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT); 
MyPanel panel = new MyPanel();
Container contentPane = getContentPane(); 
contentPane.add(panel, "Center"); 
WindowCloser listener = new WindowCloser(); 
addWindowListener(listener);
	}

private class WindowCloser extends java.awt.event.WindowAdapter {
public void windowClosing(WindowEvent event) 
{ System.exit(0);}
	}
}

class MyPanel extends JPanel 
  {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void paintComponent(Graphics g) 
{
super.paintComponent(g);
// drawing instructions go here 
// e.g.
g.setColor(Color.black); 
g.drawString("JFrame message", 20,20);
g.drawLine(10,50,20,80);
	}
}

