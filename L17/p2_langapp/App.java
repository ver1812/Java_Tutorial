import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class App extends JFrame {
    Container c;
    JLabel labName, labLang;
    JTextField txtName;
    JCheckBox cbPython, cbJava, cbJavaScript;
    Button btnSubmit;

    public App(){
        c = getContentPane();
        c.setLayout(null);
        labName = new JLabel("enter name ");
        txtName = new JTextField (10);
        labLang = new JLabel("select lang");
        cbPython = new JCheckBox("Python");
        cbJava = new JCheckBox("Java");
        cbJavaScript = new JCheckBox("JavaScript");
        btnSubmit = new Button("Submit");
        Font f= new Font("Calibri", Font. BOLD, 40); 
        labName.setFont(f); 
        labLang.setFont(f); 
        txtName.setFont(f);
        cbPython.setFont(f);
        cbJava.setFont(f);
        cbJavaScript.setFont(f);
        btnSubmit.setFont(f);
        labName.setBounds(100, 100, 200, 50);
        txtName.setBounds(300, 100, 200, 50);
        labLang.setBounds(100, 200, 200, 50);
        cbPython.setBounds(300, 200, 200, 50);
        cbJava.setBounds(300, 300, 200, 50);
        cbJavaScript.setBounds(300, 400, 200, 50);
        btnSubmit.setBounds(300, 500, 200, 50);
        c.add(labName);
        c.add(txtName);
        c.add(labLang);
        c.add(cbPython);
        c.add(cbJava);
        c.add(cbJavaScript);
        c.add(btnSubmit);

        ActionListener a = (ae) -> {
            try{
                
            String name = txtName.getText();
            
            String lang = "";
            if(cbPython.isSelected()){
                lang = lang + "Python";
            }
            if(cbJava.isSelected()){
                lang = lang + "Java";
            }
            if(cbJavaScript.isSelected()){
                lang = lang + "JavaScript";
            }
            String msg = name + " " + lang;
            JOptionPane.showMessageDialog(c, msg);

            DriverManager.registerDriver(new com.mysq1.cj.jdbc.Driver ());
            String url = "jdbc:mysql://localhost:3306/lang_14june23";
            Connection con = DriverManager.getConnection(url, "root" , "Ver@1812");
            String sql = "insert into student values (?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, lang);
            pst.executeUpdate();
            txtName.setText("");


            }catch (Exception e) {
System.out.println("issue " + e);}
        };
        btnSubmit.addActionListener(a);

        setTitle("Lang App by Viighnesh ");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
