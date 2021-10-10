package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class projectteacher extends JFrame implements ActionListener{
   projectteacher(){
        super("University Management System  ----  STAFF");
        
        setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/uniteacher.png"));
        Image i3 = ic.getImage().getScaledInstance(1500, 850,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu(" Master ");
        JMenuItem m1 = new JMenuItem("New Staff");
        JMenuItem m2 = new JMenuItem("New Student Admission");
        master.setFont(new Font("TimesRoman",Font.PLAIN,18));
        master.setForeground(new Color(63, 110, 141));
        
        
        m1.setFont(new Font("aharoni",Font.BOLD,16));
        
       
        
        m1.setBackground(Color.WHITE);
        
        m2.setFont(new Font("aharoni",Font.BOLD,16));
        
       
        
        m2.setBackground(Color.WHITE);
    
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        

  
        JMenu user = new JMenu(" Details ");
        JMenuItem u1 = new JMenuItem("Student Details");
        JMenuItem u2 = new JMenuItem("Teacher Details");
        user.setFont(new Font("TimesRoman",Font.PLAIN,18));
        user.setForeground(new Color(63, 110, 141));
        
        u1.setFont(new Font("aharoni",Font.BOLD,16));
        u1.setBackground(Color.WHITE);
        
        u2.setFont(new Font("aharoni",Font.BOLD,16));
        u2.setBackground(Color.WHITE);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        
        JMenu attendance = new JMenu(" Attendance ");
        JMenuItem a1 = new JMenuItem("Student Attendance");
        JMenuItem a2 = new JMenuItem("Teacher Attendance");
        attendance.setFont(new Font("TimesRoman",Font.PLAIN,18));
        attendance.setForeground(new Color(63, 110, 141));
        
        a1.setFont(new Font("aharoni",Font.BOLD,16));
        a1.setBackground(Color.WHITE);
        
        
        a2.setFont(new Font("aharoni",Font.BOLD,16));
        a2.setBackground(Color.WHITE);
        attendance.add(a2);

        a1.addActionListener(this);
        a2.addActionListener(this);
        
        
        
        JMenu attendance_detail = new JMenu(" Attendance-Detail ");
        JMenuItem b1 = new JMenuItem("Student Attendance Detail");
        JMenuItem b2 = new JMenuItem("Teacher Attendance Detail");
        attendance_detail.setFont(new Font("TimesRoman",Font.PLAIN,18));
        attendance_detail.setForeground(new Color(63, 110, 141));
        
        b1.setFont(new Font("aharoni",Font.BOLD,16));
        b1.setBackground(Color.WHITE);
        attendance_detail.add(b1);
        
        b2.setFont(new Font("aharoni",Font.BOLD,16));
        b2.setBackground(Color.WHITE);
        

        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        JMenu exam = new JMenu(" Examination ");
        JMenuItem c1 = new JMenuItem("Examination Details");
        JMenuItem c2 = new JMenuItem("Enter Marks");
        exam.setFont(new Font("TimesRoman",Font.PLAIN,18));
        exam.setForeground(new Color(63, 110, 141));
        
        c1.setFont(new Font("aharoni",Font.BOLD,16));
        c1.setBackground(Color.WHITE);
       
        
        c2.setFont(new Font("aharoni",Font.BOLD,16));
        c2.setBackground(Color.WHITE);
        exam.add(c2);

        c1.addActionListener(this);
        c2.addActionListener(this);
        
        JMenu report = new JMenu(" Update-Details ");
        JMenuItem r1 = new JMenuItem("Update Students");
        JMenuItem r2 = new JMenuItem("Update Teachers");
        report.setFont(new Font("TimesRoman",Font.PLAIN,18));
        report.setForeground(new Color(63, 110, 141));
        
        r1.setFont(new Font("aharoni",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);
        
        r2.setFont(new Font("aharoni",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        
        r2.addActionListener(this);
        
        
        
        JMenu fee = new JMenu(" Fee Details ");
        JMenuItem s1 = new JMenuItem("Fee Structure");
        JMenuItem s2 = new JMenuItem("Student Fee Form");
        fee.setFont(new Font("TimesRoman",Font.PLAIN,18));
        fee.setForeground(new Color(63, 110, 141));
        
        s1.setFont(new Font("aharoni",Font.BOLD,16));
        s1.setBackground(Color.WHITE);
        
        s1.addActionListener(this);
        
        s2.setFont(new Font("aharoni",Font.BOLD,16));
        s2.setBackground(Color.WHITE);
        
        s2.addActionListener(this);
        

        JMenu utility = new JMenu(" Utility ");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        utility.setFont(new Font("TimesRoman",Font.PLAIN,18));
        utility.setForeground(new Color(63, 110, 141));
        

        ut1.setFont(new Font("aharoni",Font.BOLD,16));
        ut1.setBackground(Color.WHITE);
        

        ut2.setFont(new Font("aharoni",Font.BOLD,16));
        ut2.setBackground(Color.WHITE);
        

        ut1.addActionListener(this);
        ut2.addActionListener(this);
       
       
        

        JMenu exit = new JMenu("  Exit  ");
        JMenuItem ex = new JMenuItem("");
        exit.setFont(new Font("TimesRoman",Font.PLAIN,18));
        exit.setForeground(new Color(253, 60, 80));
        

        ex.setFont(new Font("aharoni",Font.BOLD,16));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/logout.png"));
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
       
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
        
        

        master.add(m1);
        
        
        user.add(u1);
        
        
        
        report.add(r2);
        
       
       
        
        utility.add(ut1);
        utility.add(ut2);
      
        
        exit.add(ex);
         
        mb.add(master);
        mb.add(user);
        mb.add(attendance);
        mb.add(attendance_detail);
        mb.add(exam);
        mb.add(report);
        
        mb.add(utility);
        
        mb.add(exit);
        
        setJMenuBar(mb);    
        
       
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
       
        if(msg.equals("New Staff")){
            new AddTeacher().f.setVisible(true);
            
        }else if(msg.equals("Student Details")){
            new StudentDetails().setVisible(true);
            
        }
       
       
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){ }
        }
        else if(msg.equals("")){
            System.exit(0);
        }else if(msg.equals("Teacher Attendance")){
            new TeacherAttendance().setVisible(true);
        }else if(msg.equals("Student Attendance Detail")){
            new StudentAttendanceDetail().setVisible(true);
        }else if(msg.equals("Enter Marks")){
            new EnterMarks().setVisible(true);
        }else if(msg.equals("Update Teachers")){
            new UpdateTeacher().f.setVisible(true);
           
        }
        
    }
    
    
    public static void main(String[] args){
        new projectteacher().setVisible(true);
    }
    
}

