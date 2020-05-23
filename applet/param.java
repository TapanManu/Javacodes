import java.applet.Applet;
import static javax.swing.JOptionPane.*;



public class Helloapplet extends Applet{
	public void init(){
		String s = this.getParameter("first name");
		int age = Integer.parseInt(this.getParameter("age"));
		showMessageDialog(this,s+" is "+age+" years old ");
	}
}

//run using appletviewer Helloapplet.java or html-file-name.html
