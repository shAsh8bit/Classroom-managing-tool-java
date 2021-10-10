package university.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class EnterMarks extends JFrame implements ActionListener{

    JFrame f;
    JLabel l1,l2,l3,l4,id15;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b1;
    Choice o1;

    public EnterMarks(){
        f = new JFrame("Enter Marks");
        f.setBackground(Color.white);
        f.setLayout(null);

        
        o1 = new Choice();
        o1.setForeground(new Color(47, 79, 79));
	o1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
       
	try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
                o1.add(rs.getString("rollno"));
            }
        }catch(Exception e) { }
        
        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/marks.png"));
        Image i3 = img.getImage().getScaledInstance(550, 700,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        id15.setIcon(icc3);

        l1 = new JLabel("Enter marks of Student");
        l1.setFont(new Font("broadway", Font.BOLD, 30));
        l1.setBounds(30,0,500,80);
        id15.add(l1);
        f.add(id15);
        
       
        l2 = new JLabel("Enter Roll Number");
        l2.setBounds(50,70,200,40);
        l2.setFont(new Font("berlin sans FB",Font.PLAIN,15));
        id15.add(l2);
        
        
        o1.setBounds(250,80,200,20);
        id15.add(o1);

        l3 = new JLabel("Enter Subject");
        l3.setBounds(100,150,200,40);
        l3.setFont(new Font("berlin sans FB",Font.PLAIN,18));
        id15.add(l3);

        l4 = new JLabel("Enter Marks");
        l4.setBounds(300,150,200,40);
        l4.setFont(new Font("berlin sans FB",Font.PLAIN,18));
        id15.add(l4);

        t2 = new JTextField();
        t2.setBounds(50,200,200,20);
        id15.add(t2);

        t3 = new JTextField();
        t3.setBounds(250,200,200,20);
        id15.add(t3);

        t4 = new JTextField();
        t4.setBounds(50,230,200,20);
        id15.add(t4);

        t5 = new JTextField();
        t5.setBounds(250,230,200,20);
        id15.add(t5);

        t6 = new JTextField();
        t6.setBounds(50,260,200,20);
        id15.add(t6);

        t7 = new JTextField();
        t7.setBounds(250,260,200,20);
        id15.add(t7);

        t8 = new JTextField();
        t8.setBounds(50,290,200,20);
        id15.add(t8);

        t9 = new JTextField();
        t9.setBounds(250,290,200,20);
        id15.add(t9);

        t10 = new JTextField();
        t10.setBounds(50,320,200,20);
        id15.add(t10);

        t11 = new JTextField();
        t11.setBounds(250,320,200,20);
        id15.add(t11);

        b1 = new JButton("Submit");
        b1.setBounds(50,360,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        id15.add(b1);

        b1.addActionListener(this);
        f.setVisible(true);
        f.setSize(500,550);
        f.setLocation(400,200);
        getContentPane().setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource() == b1){
                conn c1 = new conn();

                String s1 = "insert into subject values('"+o1.getSelectedItem()+"','"+t2.getText()+"','"+t4.getText()+"','"+t6.getText()+"','"+t8.getText()+"','"+t10.getText()+"')";
                String s2 = "insert into marks values('"+o1.getSelectedItem()+"','"+t3.getText()+"','"+t5.getText()+"','"+t7.getText()+"','"+t9.getText()+"','"+t11.getText()+"')";

                c1.s.executeUpdate(s1);
                c1.s.executeUpdate(s2);
                
                JOptionPane.showMessageDialog(null,"Marks Inserted Successfully");
              
                this.setVisible(false);
                f. setVisible(false);
                f. dispose();
                
           }
           
        }catch(Exception e){}
    }
   
           
  

    public static void main(String[] args){
        new EnterMarks().setVisible(true);
    }
}