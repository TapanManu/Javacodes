import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<applet code="KeyBoard.class" height="500" width="800">
</applet>

*/

public class KeyBoard extends Applet implements KeyListener{
	String msg="";
	public void init(){
		addKeyListener(this);
	}
	public void keyTyped(KeyEvent ke){
		msg += ke.getKeyChar();
		repaint();
	}
	public void keyPressed(KeyEvent ke){
		repaint();
	}
	public void keyReleased(KeyEvent ke){
		if(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE){
			if(!msg.equals("")) {
                    msg = msg.substring(0, msg.length()-2);
                }
		}  


		repaint();
	}
	public void stop(KeyEvent ke){
		showStatus("Event is stopped");
	}
	public void paint(Graphics g){
		setBackground(Color.white);
		setForeground(Color.blue);
		g.drawString(msg,100,100);
	}
}
