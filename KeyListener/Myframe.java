import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Myframe extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;
    Myframe() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("r.png");
        label = new JLabel();
        label.setBounds(0,0,100,100);
      //  label.setBackground(Color.red);
        //label.setOpaque(true);
        label.setIcon(icon);
        this.getContentPane().setBackground(Color.BLACK);
        
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // keyPresssed = Invoked when a physical key is pressed down. Uses KeyCode, int
        // output
        switch(e.getKeyCode()){
            case 37:label.setLocation(label.getX()-10,label.getY());
            break;
            case 38:label.setLocation(label.getX(),label.getY()-10);
            break;
            case 39:label.setLocation(label.getX()+10,label.getY());
            break;
            case 40:label.setLocation(label.getX(),label.getY()+10);
            break;}
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyReleased = called whenever a button is released
        System.out.println("You releasec key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // keyTyped = Invoked when a key is typed. Uses KeyChar, char output

        switch(e.getKeyChar()){
            case 'a':label.setLocation(label.getX()-10,label.getY());
            break;
            case 'w':label.setLocation(label.getX(),label.getY()-10);
            break;
            case 's':label.setLocation(label.getX(),label.getY()+10);
            break;
            case 'd':label.setLocation(label.getX()+10,label.getY());
            break;
        }
    }

}
