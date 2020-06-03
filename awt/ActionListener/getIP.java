import java.awt.*;
import java.awt.event.*;
class First extends Frame implements ActionListener{
	Label l;TextField tf ;Button b;
	First(){
		l = new Label("Center Alligned",Label.CENTER);
		l.setText("IP");
		tf = new TextField();
		tf.setBounds(30,50,100,50);
		b = new Button("Final IP");
		b.setBounds(50,100,100,50);
		add(l);
		add(b);
		add(tf);
		b.addActionListener(this);
		System.out.println("label text:"+l.getText());
		setSize(450,450);
		setVisible(true);
		setLayout(null);

		Close cm = new Close();
		addWindowListener(cm);

	}
	public void actionPerformed(ActionEvent e){
		try{
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("IP of "+host+" is:"+ip);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		new First();
	}
}

class Close extends WindowAdapter{
	public void windowClosing(WindowEvent w){
				System.out.println("closing");
				System.exit(0);
			}
}
