import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class App1 extends JFrame{
    Container c;
    JLabel labName, labCompany, labPkg;
    JTextField txtName, txtCompany, txtPkg;
    JButton btnSubmit;

    App1(){
        c = getContentPane () ;
        c.setLayout (null);
        labName = new JLabel("enter name");
        txtName = new JTextField(10);
        labCompany = new JLabel("enter company ");
        txtCompany = new JTextField(10);
        labPkg = new JLabel("enter package");
        txtPkg = new JTextField(10);
        btnSubmit = new JButton( "Submit");
        Font f= new Font ("Arial", Font.BOLD, 30); 
        labName.setFont (f);
         txtName.setFont (f); 
         labCompany.setFont (f);
          txtCompany.setFont(f);
           labPkg.setFont (f);
            txtPkg.setFont (f); 
            btnSubmit.setFont (f);
            labName. setBounds ( 30,30 ,300,40 ); 
            txtName. setBounds ( 300,30 ,300 ,40 ); 
            labCompany. setBounds (30 , 100 ,300 ,40 ); 
            txtCompany. setBounds (300 , 100, 300,40 ); 
            labPkg. setBounds (30 ,170 ,300 ,40 ); 
            txtPkg.setBounds (300 ,170, 300,40 ); 
            btnSubmit. setBounds (200, 250 , 300, 40) ;
            c.add (labName);
            c.add (txtName);
            c.add (labCompany); 
            c.add (txtCompany);
            c.add (labPkg);
            c.add (txtPkg);
            c.add(btnSubmit);
            ActionListener a = (ae) -> {
                try{
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    String url = "jdbc:mysql://localhost:3306/ss_12june23";
                    String un = "root";
                    String pw = "Ver@1812";
                    Connection con = DriverManager. getConnection(url, un, pw);
                    String sql = "insert into student values (?, ?, ?)";
                    PreparedStatement pst = con.prepareStatement (sql);

                String name = new String(txtName.getText ());
                String company = new String(txtCompany. getText ());
                double pkg = Double.parseDouble (txtPkg.getText());
                pst.setString(1, name); 
                pst.setString(2, company);
                pst.setDouble (3, pkg); 
                pst.executeUpdate ();
                JOptionPane. showMessageDialog(c, "thank u");

                con.close();
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(c,"issue : " + e);
                }
                };
                btnSubmit.addActionListener(a);
                setTitle ("Success Story App");
                setSize (700, 500);
                setLocationRelativeTo (null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
    }
}
class P1{
    public static void main (String[] args){
        App1 a = new App1();
    }
}