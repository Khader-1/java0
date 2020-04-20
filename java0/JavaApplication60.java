package java0;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;


public class JavaApplication60 {

    
    public static void main(String[] args) {
        second s=new second() ;
      
        JFrame f = new JFrame();
        
        f.add(s);
        f.setVisible(true);
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Moving Car");
        
        
    }
    
}
