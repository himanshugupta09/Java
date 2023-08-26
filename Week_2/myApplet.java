import java.applet.Applet;

import java.awt.*;

import java.awt.event.*;

public class myApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Welcome",150,150);
		g.setColor(Color.yellow);
		g.drawRect(120, 50, 100, 100);
	}
}

