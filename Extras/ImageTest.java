import java.applet.*;
	import java.awt.*;
	public class ImageTest extends Applet {
		Image mona;
		public void init (  ) {
			mona = getImage (getDocumentBase ( ),  "monalisa.gif ");
		}

		public void point (Graphics g ) {
			   g.drawImage (mona, 0, 0, this);
	    }
	}

/*
<applet code="ImageTest" width=300 height=100>
</applet>
*/