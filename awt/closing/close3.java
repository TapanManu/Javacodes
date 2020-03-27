import java.awt.*;
import java.awt.event.*;
class MyFrame extends WindowAdapter{
	Frame f;
	MyFrame(){
		f = new Frame();
		f.addWindowListener(this);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent e){
		System.out.print("closing");
		f.dispose();
	}
	public static void main(String[] args) {
		new MyFrame();
	}
	
}
