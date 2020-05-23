import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code = "Helloapplet.class" width="300" height="300">
	</applet>

*/

public class Helloapplet extends Applet{
	public void paint(Graphics g){
		g.drawString("Hello World",150,150);
	}
}

//run using appletviewer Helloapplet.java
