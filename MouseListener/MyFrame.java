import java.awt.Color;
import java.awt.event.*;
import java.awt.*;
import javax.sound.sampled.SourceDataLine;
import javax.swing.*;



public class MyFrame extends JFrame implements MouseListener  {
    

    JLabel label;

    ImageIcon smile;
    ImageIcon chill;
    ImageIcon sad;
    ImageIcon love;


    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        
        label  = new JLabel();
        label.addMouseListener(this);

        smile = new ImageIcon("smile.png");
        chill = new ImageIcon("chill.png");
        love = new ImageIcon("love.png");
        sad = new ImageIcon("sad.png");
        //this.setLayout(null);
       
        //label.setBounds(0, 0, 100, 100);
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        label.setIcon(smile);
        //this.addMouseListener(this);// its work on whole frame as we want to do.
        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Invoked when the mouse button has been clicked (pressed and released) on a component
   // System.out.println("You clicked the mouse");
   // label.setBackground(Color.red);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        //Invoked when a mouse button has been pressed on component
       // System.out.println("You pressed the mouse");
        //label.setBackground(Color.yellow);
        label.setIcon(smile);
        

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Invoked when a mouse button has been released on a component
        //System.out.println("You released the mouse");
        //label.setBackground(Color.green);
        label.setIcon(chill);

    }
    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when the mouse enters a component
       //System.out.println("You entered the mouse");
       //label.setBackground(Color.blue);
       label.setIcon(sad);

    }
    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse exits a component
       //System.out.println("You exited the mouse");
       //label.setBackground(Color.black);
       label.setIcon(love);

    }

    
}
