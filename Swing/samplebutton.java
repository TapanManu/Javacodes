import javax.swing.*;
import java.awt.event.*;
import java.awt.GraphicsConfiguration;

class Display{
	static GraphicsConfiguration gc;
	Display(){
		JFrame f = new JFrame("swing window",gc);
		JButton b = new JButton("click me");
		JLabel l = new JLabel();
        b.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
              	l.setText("clicked");
              }
        });
        f.add(b);
        f.add(l);
        f.setLayout(null);
        f.setSize(300,300);
        b.setBounds(100,100,150,50);
        l.setBounds(100,200,50,50);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new Display();
	}
}
