import java.applet.Applet;
import java.awt.Graphics;




public class Helloapplet extends Applet{
	String str=null;
	public void init(){
		String s = getParameter("first name");
		int age = Integer.parseInt(getParameter("age"));
		str = s+" is "+age+" years old ";
	}
	public void paint(Graphics g){
		g.drawString(str,100,100);
	}
}

//run using appletviewer Helloapplet.java or html-file-name.html
