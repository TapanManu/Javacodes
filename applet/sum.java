import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code = "Helloapplet.class" width="300" height="300">
	</applet>

*/

public class Helloapplet extends Applet{
	public void paint(Graphics g){
		int x=10,y=25;
		int add=x+y;
		String s ="add:"+String.valueOf(add);
		g.drawString(s,150,150);
	}
}

//run using appletviewer Helloapplet.java or html-file-name.html
