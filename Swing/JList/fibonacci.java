import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

class Fibonacci extends JFrame {
	JTextField t;
	JList l;
	DefaultListModel<String> item;
	int num;
	Fibonacci(){
		t = new JTextField();
		setLayout(null);
		setVisible(true);	
		item = new DefaultListModel<String>();
		l = new JList(item);
		JScrollPane sp = new JScrollPane(l);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		add(t);
		add(l);
		t.setBounds(100,100,50,50);
		l.setBounds(150,150,50,200);
		setSize(400,400);
        t.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
		
        if(e.getSource()==t){
        	num = Integer.parseInt(t.getText());
        	for(int i=0;i<num;i++){
                 item.addElement(String.valueOf(fib(i)));
        	}
        }
	}
        });
	}
	
	public static int fib(int x){
		if(x<=1)
			return x;
		return fib(x-1)+fib(x-2);
	}
	public static void main(String[] args) {
		new Fibonacci();
	}
}
