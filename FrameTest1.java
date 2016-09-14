package Lab7;


import javax.swing.JFrame; 
public class FrameTest1 
{
public static void main(String args[]) 
{
EmptyFrame frame = new EmptyFrame(); 
frame.setTitle("Frame test"); 
frame.setVisible(true);
	}
}

class EmptyFrame extends JFrame 
{
public EmptyFrame()
{
final int DEFAULT_FRAME_WIDTH = 300; 
final int DEFAULT_FRAME_HEIGHT = 300; 
setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT); 
	}
}

