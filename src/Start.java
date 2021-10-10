package university.management.system;

import java.awt.*;
import javax.swing.*;


public class Start{
    public static void main(String s[]){
        Frame f = new Frame("University Management System"); 
        f.setVisible(true); 
        
        f.setSize(1400,950);
        f.setLocation(25,30);
           
           
    }
}
class Frame extends JFrame implements Runnable{
    
    Frame(String s){
        super(s);
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/uni2.png"));
        Image i1 = c1.getImage().getScaledInstance(2000, 1000,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel m1 = new JLabel(i2);
        add(m1);
        Thread t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
          
            this.setVisible(true);
            Login f1= new Login();
            
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
}