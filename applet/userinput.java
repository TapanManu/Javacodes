import java.applet.*;
import java.awt.*;

public class Helloapplet extends Applet{
	TextField t1,t2;
	public void init(){
		t1 = new TextField(5);
		t2 = new TextField(5);
		add(t1);
		add(t2);
		t1.setText("5");
	}
	public void paint(Graphics g){
		int x=0;
		String t = t1.getText();
		x= Integer.parseInt(t);
		t2.setText(String.valueOf(x*x));
	}
}

//run using appletviewer Helloapplet.java or html-file-name.html
