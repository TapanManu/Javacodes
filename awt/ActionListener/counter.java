import java.awt.*;
import java.awt.event.*;
class First extends Frame implements ActionListener{
	int count=0;
	Button up,down,reset;
	TextField tf;
	Label l;
	First(){
		setLayout(null);
		setVisible(true);
		setSize(300,300);
		up = new Button("Count Up");
		down = new Button("Count down");
		reset = new Button("Reset");
		l = new Label();
		l.setText("Counter:"+count);
		add(up);
		add(down);
		add(reset);
		add(l);
		setBackground(Color.yellow);
		setForeground(Color.black);
		up.setBounds(50,30,80,50);
		down.setBounds(130,30,80,50);
		reset.setBounds(210,30,60,50);
		l.setBounds(0,130,100,50);
		up.addActionListener(this);
		down.addActionListener(this);
		reset.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== up){
			l.setText("Counter:"+ (++count));
		}
		if(e.getSource()== down){
			l.setText("Counter:"+ (--count));
		}
		if(e.getSource()== reset){
			l.setText("Counter:"+"0");
		}
	}
	public static void main(String[] args) {
		new First();
	}
	}
