import java.awt.*;
import java.awt.event.*;

class TempConverter extends Frame implements TextListener{
	TextField t1,t2;
	Label l1,l2;
public TempConverter(){
	setLayout(null);
	setSize(450,450);
	t1 = new TextField();
	t2 = new TextField();
	l1 = new Label("celsius temperature",Label.LEFT);
	l2 = new Label("fahrenheit temperature",Label.LEFT);
	setBackground(Color.white);
	setVisible(true);
	t1.addTextListener(this);
	//t2.addTextListener(this);
	add(t1);
	add(t2);
	add(l1);
	add(l2);
	l1.setBounds(0,200,200,50);
	l2.setBounds(0,250,200,50);
    t1.setBounds(200,200,100,50);
	t2.setBounds(200,250,100,50);
	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.out.println("closed");
			dispose();
		}
	});
}
public void textValueChanged(TextEvent e){
	try{
	if(e.getSource()==t1){
	  t2.setText("");
	  String celsius = t1.getText().toString();
      String fahrenheit = String.valueOf(1.8*(Float.parseFloat(celsius))+32);
      t2.setText(fahrenheit);
	}
	if(e.getSource()==t2){
		t1.setText("");
		String f = t2.getText().toString();
		String c = String.valueOf((5.0/9.0)*(Float.parseFloat(f)-32));
		t1.setText(c);
	}
    }
    catch(NumberFormatException ne){
    	t2.setText("");
    	t1.setText("");
    	System.out.println("handled");
    }
      
}
public static void main(String[] args) {
	new TempConverter();
}
}
