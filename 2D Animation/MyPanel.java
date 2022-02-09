import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener{
    
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;

    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel(){
       this.setPreferredSize(new Dimension(PANEL_HEIGHT,PANEL_WIDTH));
       this.setBackground(Color.black);
       enemy = new ImageIcon("e.png").getImage();
       backgroundImage  = new ImageIcon("s.jpg").getImage();
       timer = new Timer(5,this);
       timer.start();
    }

    public void paint(Graphics g){
        super.paint(g);//this paint background
        Graphics2D g2D = (Graphics2D)g;
        g.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(x>=PANEL_WIDTH-enemy.getWidth(null) || x<0)
       {
           xVelocity = xVelocity * -1;
       }
        x = x+xVelocity;
    if(y>=PANEL_HEIGHT-enemy.getHeight(null) || y<0)
    {
        yVelocity = yVelocity * -1;
    }
     y= y+yVelocity;
        repaint();

    }
}
