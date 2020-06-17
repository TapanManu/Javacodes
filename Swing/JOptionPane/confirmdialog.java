import javax.swing.*;
import java.awt.event.*;
class MyFrame extends WindowAdapter{
	JFrame f;
	MyFrame(){
		f = new JFrame();
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(this);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setSize(300,300);
	}
	public void windowClosing(WindowEvent e){
		int a =JOptionPane.showConfirmDialog(f,"Are you sure you want to exit?");
		if(a==JOptionPane.YES_OPTION){
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
