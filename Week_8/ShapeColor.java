import java.applet.*;
import java.awt.*;

public class ShapeColor extends Applet
{
	int x = 300,y = 100,r = 50;
	

	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.setColor(Color.black);
		g.drawString("Line",100,100);
		
		g.drawOval(x-r,y-r,100,100);
		g.setColor(Color.yellow);
		g.fillOval(x-r,y-r,100,100);
		g.setColor(Color.magenta);
		g.drawString("Circle",275,100);

		g.drawRect(400,50,200,100);
		g.setColor(Color.yellow);

		g.fillRect(400,50,200,100);
		g.setColor(Color.magenta);
		g.drawString("Rectangel",450,100);
	}
}

