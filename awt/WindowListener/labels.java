import java.awt.*;
import java.awt.event.*;
class First extends Frame{
	Label l1,l2;
	First(){
		l1 = new Label("Center Alligned",Label.CENTER);
		l2 = new Label();
		l2.setText("Right alligned");
		l2.setAlignment(Label.RIGHT);
		add(l1);
		add(l2);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent w){
				System.out.println("closing");
				dispose();
			}
		});
		System.out.println("label text:"+l1.getText());
		setSize(450,450);
		setVisible(true);
		setLayout(new GridLayout(2,2));

	}
	public static void main(String[] args) {
		new First();
	}
}
