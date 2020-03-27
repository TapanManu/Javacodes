import java.awt.*;
import java.awt.event.*;
//implementing window listener
class MyFrame extends Frame implements WindowListener{
	MyFrame(){
		addWindowListener(this);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
	public void windowActivated(WindowEvent e){System.out.println("Window Activated");}
	public void windowClosed(WindowEvent e){
		System.out.println("Window closed");
		 }
	public void windowClosing(WindowEvent e){
		System.out.println("Window is closing");
		dispose();
	}
    public void windowDeactivated(WindowEvent e){System.out.println("Window Deactivated");}
    public void windowDeiconified(WindowEvent e){System.out.println("Window deiconified");}
    public void windowIconified(WindowEvent e){System.out.println("Window iconified");}
    public void windowOpened(WindowEvent e){System.out.println("Window Opened");}

}
