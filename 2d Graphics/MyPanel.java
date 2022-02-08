import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;

import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
    Image image;
    MyPanel(){
        image = new ImageIcon("7.jpg").getImage();
        this.setPreferredSize(new DimensionUIResource(500, 500));
    }

        public void paint(Graphics g){

            Graphics2D g2D = (Graphics2D) g;

            g2D.setPaint(Color.blue);
            g2D.drawImage(image, 0, 0, null);
            //g2D.setStroke(new BasicStroke(5));
            // g2D.drawLine(0, 0, 500, 500);
            //g2D.drawRect(0, 0, 100, 200);
          // g2D.fillRect(0, 0, 100, 200);
         // g2D.drawOval(0, 0, 100, 100);
         ///g2D.fillOval(0, 0, 100, 100);
      //   g2D.setPaint(Color.blue);
       //  g2D.fillArc(150, 150, 100, 100, 0, 180);
        // g2D.drawArc(150, 150, 100, 100, 0, 180);
       // g2D.setPaint(Color.white);
        //g2D.fillArc(150, 150, 100, 100, 180, 180);

        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.setPaint(Color.yellow);
        g2D.drawPolygon(xPoints,yPoints,3);
       g2D.fillPolygon(xPoints,yPoints,3);
       //g2D.setPaint(Color.blue);
      // g2D.setFont(new Font("Greek",Font.PLAIN,50));
    //  g2D.drawString("I am winner : ) ", 50, 50);
       
        }

    
}
