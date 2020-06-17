import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
class MyFrame extends JFrame {
	JList l;
	MyFrame(){
		setLayout(null);
		l = new JList(new String[]{"India","Germany","Australia"});
		JScrollPane j = new JScrollPane(l);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(0,255,0));
        l.addListSelectionListener(
        	new ListSelectionListener(){
        		public void valueChanged(ListSelectionEvent e){
			JOptionPane.showMessageDialog(null,l.getSelectedValue().toString());	
	}
        	}
        	);
        add(l);
        l.setBounds(200,200,100,50);
        add(j);
        j.setBounds(200,200,100,50);
		
	}
	
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
