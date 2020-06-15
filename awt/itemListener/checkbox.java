import java.awt.*;
import java.awt.event.*;

class Display extends Frame implements ItemListener{
	CheckboxGroup g;
	Label l;
	Checkbox c,j,p,k;
	Display(){
       setVisible(true);
       setSize(300,300);
       setLayout(new FlowLayout());
       l = new Label();
       g = new CheckboxGroup();
       c = new Checkbox("C++",g,false);
       j = new Checkbox("Java",g,false);
       p = new Checkbox("Python",g,false);
       k = new Checkbox("Kotlin",g,false);

       add(c);
       add(j);
       add(p);
       add(k);
       add(l);

       c.addItemListener(this);
       j.addItemListener(this);
       p.addItemListener(this);
       k.addItemListener(this);
 
       setBackground(Color.white);

	}
	public void itemSelected(ItemEvent e){
		if(e.getSource()==c)
             l.setText("c++");
         if(e.getSource()==j)
         	l.setText("java");
         if(e.getSource()==p)
         	l.setText("python");
         if(e.getSource()==k)
         	l.setText("kotlin");

	}
	public void itemStateChanged(ItemEvent e){
		System.out.println("changed");
	}
	public static void main(String[] args) {
		new Display();
	}
}
