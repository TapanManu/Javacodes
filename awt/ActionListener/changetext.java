import java.awt.*;
import java.awt.event.*;
class First extends Frame implements ActionListener{
	TextField tf;
	First(){
		tf = new TextField();
		tf.setBounds(120,120,80,50);
		tf.setText("Hello all!");
		Button b = new Button("Click me");
		b.setBounds(120,180,80,50);
		setVisible(true);
		setLayout(null);
		setSize(400,400);
		setBackground(Color.green);
		add(tf);
		add(b);

		b.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				tf.setText("Bye");
				dispose();
			}
		});
	}
	public void actionPerformed(ActionEvent a){
		tf.setBounds(120,180,140,50);
		tf.setText("Action worked");
	}
	public static void main(String[] args) {
		new First();
	}
}
