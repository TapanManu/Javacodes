import java.awt.*;
import java.awt.event.*;

public class Display extends Frame implements MouseListener{
    int x,y;
	Display(){
         addMouseListener(this);
         setVisible(true);
         setSize(300,300);

	}
	public void mouseClicked(MouseEvent e){
    	x=e.getX();
    	y=e.getY();
    	System.out.println("mouse clicked at:"+x+","+y);
    	repaint();
	}
	public void mouseEntered(MouseEvent e){
		x = e.getX();
		y = e.getY();
		System.out.println("mouse entered at:"+x+","+y);
		repaint();
	}
	public void mouseExited(MouseEvent e){
		x = e.getX();
		y = e.getY();
		System.out.println("mouse exited at :"+x+","+y);
		repaint();
	}
	public void mousePressed(MouseEvent e){
		x = e.getX();
		y = e.getY();
		System.out.println("mouse pressed at :"+x+","+y);
		repaint();
	}
	public void mouseReleased(MouseEvent e){
		x = e.getX();
		y = e.getY();
		System.out.println("mouse released at :"+x+","+y);
		repaint();
	}
	public void paint(Graphics g){
		g.setColor(Color.GREEN);
		g.drawLine(x,y,x+10,y+10);

	}
	public static void main(String[] args) {
		new Display();
	}
}
