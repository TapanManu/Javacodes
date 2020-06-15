import java.awt.*;
import java.awt.event.*;

class SubFrame implements ActionListener{
	Label l;Button b;
	Frame f;
	int count=0;
	SubFrame(){
		f = new Frame();
		l = new Label("hello world",Label.LEFT);
		b = new Button("click me");
		b.addActionListener(this);
		b.setBounds(100,100,150,50);
		f.setBackground(new Color(255,200,0));
		f.setVisible(true);
		f.setSize(300,300);
		f.setLayout(null);
		f.add(b);
		f.add(l);
        f.addWindowListener(new WindowAdapter(){
        	public void windowClosing(WindowEvent e){
        		f.dispose();
        	}
        });
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b){
            f.setBackground(new Color(255,100,0));
            f.setForeground(new Color(255,255,255));
		}
	}
	public static void main(String[] args) {
		new SubFrame();
	}
}
