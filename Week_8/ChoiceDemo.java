// To Create Choice Component // 
import java.awt.*;
import java.applet.*;

public class ChoiceDemo extends Applet
{
	public void init()
	{
		int width = Integer.parseInt(getParameter("width"));
		int height  = Integer.parseInt(getParameter("height"));
		
		Choice os = new Choice();  // os is an instance of choice class.
		Choice browser = new Choice(); 
		os.addItem("Windows 11");
		os.addItem("Solaris ");
		os.addItem("Linux ");
		browser.addItem("Netscape Navigator");
		browser.addItem("Hot Java");
		add(os);
		add(browser);
		os.reshape(0,0,width/2,height/2);
		browser.reshape(0,height/2,width,height);
	}
}
/*
<applet code="ChoiceDemo" width=300 height=100>
</applet>
*/		