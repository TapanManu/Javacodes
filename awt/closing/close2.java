import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame {
	MyFrame(){
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("window is closing");
				dispose();
			}
		});
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
	
}
