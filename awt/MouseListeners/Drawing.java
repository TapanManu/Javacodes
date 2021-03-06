import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.geom.Line2D;

class MyFrame {
	public static void main ( String[] args )
{
    JFrame paint = new JFrame ();

    paint.add ( new JComponent ()
    {
        private List<Shape> shapes = new ArrayList<Shape> ();
        private Shape currentShape = null;

        {
        MouseAdapter mouseAdapter = new MouseAdapter ()
        {
            public void mousePressed ( MouseEvent e )
            {
            currentShape = new Line2D.Double ( e.getPoint (), e.getPoint () );
            shapes.add ( currentShape );
            repaint ();
            }

            public void mouseDragged ( MouseEvent e )
            {
            Line2D shape = ( Line2D ) currentShape;
            shape.setLine ( shape.getP1 (), e.getPoint () );
            repaint ();
            }

            public void mouseReleased ( MouseEvent e )
            {
            currentShape = null;
            repaint ();
            }
        };
        addMouseListener ( mouseAdapter );
        addMouseMotionListener ( mouseAdapter );
        }

        protected void paintComponent ( Graphics g )
        {
        Graphics2D g2d = ( Graphics2D ) g;
        g2d.setPaint ( Color.BLACK );
        for ( Shape shape : shapes )
        {
            g2d.draw ( shape );
        }
        }
    } );

    paint.setSize ( 500, 500 );
    paint.setLocationRelativeTo ( null );
    paint.setVisible ( true );
}
}
