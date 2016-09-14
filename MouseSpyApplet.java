package Lab7;

import java.applet.Applet;
public class MouseSpyApplet extends Applet 
{
/**
	 * 
	 */
private static final long serialVersionUID = 1L;

public MouseSpyApplet()
{
MouseSpy listener = new MouseSpy(); 
addMouseListener(listener);
	}
}

