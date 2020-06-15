import java.awt.*;
import java.awt.event.*;

class Display  implements ItemListener{
	Label l;
	Choice c;
	Frame f;
	Display(){
	   f = new Frame();
       f.setVisible(true);
       f.setSize(300,300);
       f.setLayout(new FlowLayout());
       l = new Label("Programming languages");
       c = new Choice();

       c.add("c++");
       c.add("java");
       c.add("python");
       
       f.add(c);
       f.add(l);

       c.addItemListener(this);
 
       f.setBackground(new Color(255,0,255));
       f.setForeground(Color.white);

	}
	
	public void itemStateChanged(ItemEvent e){
		if(e.getSource()==c){
		System.out.println("hello");
		if (c.getSelectedItem().equals("c++"))
			f.setBackground(new Color(255,0,0));
		else if (c.getSelectedItem().equals("java"))
			f.setBackground(new Color(255,100,200));
		else if (c.getSelectedItem().equals("python"))
			f.setBackground(new Color(200,0,200));
	}
}
	public static void main(String[] args) {
		new Display();
	}
}
