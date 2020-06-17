import javax.swing.JFrame;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

class MyFrame extends MouseMotionAdapter{
	JFrame f;
	int x,y;
	Color rgb;
	MyFrame(){
		f = new JFrame("Magic colors");
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		f.addMouseMotionListener(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    public void mouseMoved(MouseEvent e){
        x=e.getX();
        y=e.getY();
        if(x<=200 && y<=200)
            rgb=Color.GREEN;
        if(x>200 && y<=200)
        	rgb=Color.ORANGE;
        if(x<=200 && y>200)
        	rgb=Color.YELLOW;
        if(x>200 && y>200)
        	rgb=Color.RED;
        f.getContentPane().setBackground(rgb);
    }
	public static void main(String[] args) {
		new MyFrame();
	}
}
