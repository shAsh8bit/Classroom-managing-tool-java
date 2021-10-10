
package university.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class ExaminationDetails extends JFrame implements ActionListener{

   private JPanel contentPane;
   private JTable table;
   private JTextField search;
   private JButton b1,b2,b3;
  

   
    public void Book() {
        try {
            conn con = new conn();
            String sql = "select * from student";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {}

    }

   public ExaminationDetails() {

        setBounds(100, 200, 930, 475);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        
        setContentPane(contentPane);
        contentPane.setLayout(null);  

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79, 133, 1080, 282);
        contentPane.add(scrollPane);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
               int row = table.getSelectedRow();
               search.setText(table.getModel().getValueAt(row, 10).toString());
            }
        });
       
        table.setBackground(new Color(240, 248, 255));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        scrollPane.setViewportView(table);

        b1 = new JButton("Result");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(250, 164, 167), 1, true));
        b1.setForeground(new Color(0,0,0));
        b1.setBackground(new Color(255,255,255));
        b1.setFont(new Font("berlin sans FB",Font.PLAIN,18));
        b1.setBounds(564, 89, 138, 33);
        contentPane.add(b1);
       
        b1.addMouseListener(new MouseAdapter() {
         Color color = b1.getForeground();
         public void mouseEntered(MouseEvent me) {
            
            b1.setBackground(new Color(250, 164, 167)); 
         }
         public void mouseExited(MouseEvent me) {
            b1.setBackground(new Color(255,255,255));
         }
      });
        
        JLabel l1 = new JLabel("Check Result");
        l1.setForeground(new Color(103, 198, 253));
        l1.setFont(new Font("broadway",Font.BOLD,40));
        l1.setBounds(150, 10, 400, 47);
        contentPane.add(l1);

       
        search = new JTextField();
        search.setBackground(new Color(255, 240, 245));
        search.setBorder(new LineBorder(new Color(103, 198, 253), 2, true));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("berlin sans FB",Font.PLAIN, 17));
        search.setBounds(189, 89, 357, 33);
        contentPane.add(search);
        search.setColumns(10);

        JLabel l3 = new JLabel();
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/previous.png"));
        Image i3 = img.getImage().getScaledInstance(40, 30,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        l3.setIcon(icc3);
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                dispose();
            }
            });
        
       
        l3.setBounds(97, 89, 72, 33);
        contentPane.add(l3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 164, 167), 3, true), "",
        TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
        panel.setBounds(67, 54, 1100, 368);
        contentPane.add(panel);
        panel.setBackground(Color.WHITE);
        Book();
        setSize(1200,500);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){            
                new Marks(search.getText()).setVisible(true);
                this.setVisible(false);
            };
        }
        catch(Exception e){}
    }

    public static void main(String[] args){
        new ExaminationDetails().setVisible(true);
    }
}