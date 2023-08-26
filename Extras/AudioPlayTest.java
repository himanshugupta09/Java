import java.applet.*;
import java.awt.*;

public class AudioPlayTest extends Applet{
	public void init ( ) {			// To Place a Play button in the applet
		setLayout (new FlowLayout (FlowLayout. CENTER ));
		Button playButton = new Button ("Play" );
		add (playButton );
	}

	public boolean action (Event e, object button) {
		if ("Play".equals (button))  {
			play (getDocumentBase ( ), "audio\bda.mp3" );
				return true;
			}
		}
}

/*
<applet code="AudioPlayTest" width=800 height=600>
</applet>
*/