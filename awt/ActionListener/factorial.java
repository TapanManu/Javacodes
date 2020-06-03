import java.awt.*;
import java.awt.event.*;
class First extends Frame implements ActionListener{
	int num;
	Button a;
	TextField t;
	Label l;
	First(){
		setLayout(null);
		setVisible(true);
		setSize(300,300);
		t = new TextField();
		a = new Button("Calculate Factorial");
		l = new Label();
		l.setText("fact:");
		add(a);
		add(l);
		add(t);
		setBackground(Color.white);
		setForeground(Color.black);
		
		a.setBounds(120,220,140,50);
		l.setBounds(0,130,100,50);
		t.setBounds(120,120,50,50);

		a.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== a){
			long fact =1;
			num = Integer.parseInt(t.getText());
			for(int i=1;i<=num;i++)
				fact*=i;
			l.setText("fact:"+fact);	
		}
	}
	public static void main(String[] args) {
		new First();
	}
	}
