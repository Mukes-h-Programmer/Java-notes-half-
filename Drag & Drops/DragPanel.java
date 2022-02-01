import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.event.MouseEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.*;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("smile.png");

   final int width = image.getIconWidth();
   final int height = image.getIconHeight();
   Point imageCorner;
   Point prevPT;
    DragPanel() {
        
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());

    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e){
            prevPT = e.getPoint();
        }

    }

    private class DragListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();
            imageCorner.translate(
                (int)(currentPt.getX()-prevPT.getX()),
                (int)(currentPt.getY()-prevPT.getY())
            );
            prevPT = currentPt;
            repaint();
        }
    }
}