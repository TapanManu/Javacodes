import java.awt.*;
import java.awt.event.*;

public class Display extends Frame implements MouseMotionListener{
    int oldx,oldy,newx,newy;
    
	Display(){
		
        addMouseMotionListener(this);
        setVisible(true);
        setSize(300,300);

	}
	public void mouseMoved(MouseEvent e){
    	oldx=e.getX();
    	oldy=e.getY();
    	//repaint();
	}
	public void mouseDragged(MouseEvent e){
		newx = e.getX();
		newy = e.getY();
		repaint();
	}
	public void paint(Graphics g){
       
		g.setColor(Color.BLUE);
		g.drawLine(oldx,oldy,newx,newy);
        oldx=newx;
        oldy=newy;
    
	}
	public static void main(String[] args) {
		new Display();
	}
}
