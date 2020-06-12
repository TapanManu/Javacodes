import java.awt.*;
import java.awt.event.*;

class FrameText extends KeyAdapter{
	TextArea area;
	Label l;
	Frame f;
public FrameText(){
	f = new Frame("Key adapter");
	f.setLayout(null);
	f.setSize(450,450);
	area = new TextArea();
	l = new Label();
	f.setBackground(Color.white);
	f.setVisible(true);
	f.add(area);
	f.add(l);
	l.setBounds(20,50,200,20);
	area.setBounds(20,80,300,300);
	area.addKeyListener(this);
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.out.println("closed");
			f.dispose();
		}
	});

}
public void ke(KeyEvent e){
	  String text = area.getText();
	  String words[] = text.split("\\s");
	  l.setText("Words:"+words.length+"Characters:"+text.length());
}
public static void main(String[] args) {
	new FrameText();
}
}
