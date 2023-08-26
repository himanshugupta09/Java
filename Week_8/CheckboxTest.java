import java.awt.*;
import java.applet.*;

public class CheckboxTest extends Applet
{
	public void init()
	{
		Checkbox c1 = new Checkbox(); //Default Constructor without any Label
		Checkbox c2 = new Checkbox("Solaris"); //CheckBox with default Layout
		Checkbox c3 = new Checkbox("Macintosh",null,false);
		Checkbox c4 = new Checkbox("Windows",null,true);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
	}
}
<applet code="CheckboxTest" width=300 height=100>
</applet>
		