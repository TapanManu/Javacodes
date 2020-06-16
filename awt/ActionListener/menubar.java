import java.awt.*;
import java.awt.event.*;

public class Display extends Frame implements ActionListener{
	MenuItem item1,item2,item3,item4,item5;
	Menu lang,states;
	Label l;
	Display(){
	   l = new Label("not selected");
       MenuBar m = new MenuBar();
       lang = new Menu("Languages");
       lang.add(item1=new MenuItem("Malayalam"));
       lang.add(item1=new MenuItem("Hindi"));
       lang.add(item1=new MenuItem("Kannada"));
       m.add(lang);
       
       states = new Menu("States");
       states.add(item4 = new MenuItem("Kerala"));
       states.add(item5 = new MenuItem("Karnataka"));
       m.add(states);
       setMenuBar(m);
       setVisible(true);
       setSize(300,300);

       states.addActionListener(this);
       lang.addActionListener(this);
       add(l);
       l.setBounds(150,150,100,100);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==states){
               l.setText("states:"+e.getActionCommand());
		}
		if(e.getSource()==lang){
               l.setText("lang:"+e.getActionCommand());
		}
	}
	public static void main(String[] args) {
		new Display();
	}
}
