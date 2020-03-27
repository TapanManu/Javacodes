import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
	MyFrame(){
		Button b1 = new Button("click 1");
		Button b2 = new Button("click 2");
		Button b3 = new Button("click 3");
		Button b4 = new Button("click 4");
		Button b5 = new Button("click 5");
		Button b6 = new Button("click 6");
		Button b7 = new Button("click 7");
		Button b8 = new Button("click 8");
		b1.setBounds(30,100,80,30);
		b2.setBounds(110,100,80,30);
		b3.setBounds(190,100,80,30);
		b4.setBounds(190,130,80,30);
		b5.setBounds(190,160,80,30);
		b6.setBounds(190,190,80,30);
		b7.setBounds(110,160,80,30);
		b8.setBounds(30,130,80,30);
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);
		setLayout(new FlowLayout());
		setSize(300,300);
		setTitle("Layout");
		setVisible(true);

	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
