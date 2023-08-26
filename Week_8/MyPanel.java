import java.awt.*;

public class MyPanel
{
	public static void main(String args[])
	{
		Frame frame = new Frame("Frame with  panel");
		Panel panel = new Panel();
		frame.resize(400,400);
		frame.setBackground(Color.blue);
		frame.setLayout(null);
		panel.resize(100,100);
		panel.setBackground(Color.yellow);
		frame.add(panel);
		frame.show();
	}
}
/*
<applet code="MyPanel" width=300 height=100>
</applet>
*/