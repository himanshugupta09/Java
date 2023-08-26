// Program to create Button in Applet //

import java.applet.Applet;
import java.awt.*;

public class ButtonTest extends Applet
{
	public void init()
	{
		Button b1,b2;
		b1 = new Button("Welcome");
		add(b1);
		b2 = new Button();
		add(b2);
	}
}
/*
<applet code="ButtonTest" width=300 height=100>
</applet>
*/