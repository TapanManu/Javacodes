import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.Paint;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

class Tester {
   public static void main(String[] args)        
      throws ClassNotFoundException, InstantiationException,        
      IllegalAccessException, UnsupportedLookAndFeelException {
       
      JFrame.setDefaultLookAndFeelDecorated(true);
      // Create the GUI on the event-dispatching thread
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            createWindow();                      
         }
      });
   }

   private static void createWindow() {          
      JFrame frame = new JFrame("Translucent Window");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      createUI(frame);
      frame.setVisible(true);          
   }

   private static void createUI(JFrame frame){
      frame.setLayout(new GridBagLayout());
      frame.setSize(200, 200);            
      frame.setLocationRelativeTo(null);
      frame.setBackground(new Color(255,0,0,0));

      JPanel panel = new javax.swing.JPanel() {
         protected void paintComponent(Graphics g) {
            if (g instanceof Graphics2D) {
                              
               Paint p =
                  new GradientPaint(0.0f, 0.0f, new Color(100, 100, 100, 100),
                  getWidth(), getHeight(), new Color(255, 200, 100, 255), true);
               Graphics2D g2d = (Graphics2D)g;
               g2d.setPaint(p);
               g2d.fillRect(0, 0, getWidth(), getHeight());
            } else {
               super.paintComponent(g);
            }
         }
      };
      panel.setLayout(new GridBagLayout());
      panel.add(new JButton("Hello World"));
      frame.setContentPane(panel);
   }
}
