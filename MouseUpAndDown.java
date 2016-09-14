package Lab7;

import java.applet.Applet; 
import java.awt.*;
import java.awt.event.*;

public class MouseUpAndDown extends Applet 
{
private int x, y;
private boolean first; 
private Font f;

public MouseUpAndDown() 
{
first = true;
f = new Font("TimesRoman", Font.BOLD, 14); MouseClickedListener listener = new MouseClickedListener(); 
addMouseListener(listener);
	}

public void paint( Graphics g)
{
// these statements will not execute on the first call 
// to paint
if (first == false)
{
String s = "MouseClicked at "; 
g.setFont(f) ;
s = s + "(" + x + "," + y +")!" ;
g.drawString(s, x, y);
}
}
private class MouseClickedListener extends MouseAdapter {
	public void mouseClicked(MouseEvent event)
	{
	first = false; // enable statements in paint 
	x = event.getX();
	y = event.getY(); 
	repaint();
			} //end mouseClicked()
	} //end inner class MouseClickedListener 

	} 


