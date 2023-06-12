import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class App2 extends JFrame{
    Container c;
    JLabel labName, labFeedback;
    JTextField txtName;
    JRadioButton rbExcellent, rbSuperb, rbFantastic;
    JButton btnSubmit;

    App2(){
        c = getContentPane () ;
        c.setLayout (null);
        labName = new JLabel("enter name");
        txtName = new JTextField (10);
        labFeedback = new JLabel("select feedback");
        rbExcellent = new JRadioButton("Excellent", true);
        rbSuperb = new JRadioButton ("Superb");
        rbFantastic = new JRadioButton("Fantastic");
        btnSubmit = new JButton("Submit");
        
        Font f= new Font("Arial", Font. BOLD, 30); 
        labName. setFont (f); 
        txtName.setFont(f); 
        labFeedback.setFont (f); 
        rbExcellent.setFont(f) ; 
        rbSuperb.setFont (f); 
        rbFantastic.setFont (f); 
        btnSubmit.setFont(f);
        labName. setBounds ( 30,30,300,40 ); 
        txtName. setBounds ( 300,30 ,300 ,40 ); 
        labFeedback. setBounds ( 30, 100 ,300,40 ); 
        rbExcellent. setBounds ( 300, 100 ,300 ,40 ); 
        rbSuperb. setBounds ( 300, 150 ,300 ,40 ); 
        rbFantastic.setBounds ( 300,200 ,300 ,40 ); 
        btnSubmit.setBounds (200,300, 300, 40);
        
        ButtonGroup bg = new ButtonGroup () ;
        bg.add (rbFantastic);
        bg.add (rbSuperb); 
        bg.add(rbExcellent);
        c.add(labName); 
        c.add(txtName);
        c.add (labFeedback);
        c.add (rbExcellent);
        c.add(rbSuperb);
        c.add (rbFantastic); 
        c.add(btnSubmit);
        ActionListener a = (ae) -> {
            String name = new String (txtName.getText());
            String fb = "";
        if (rbExcellent.isSelected())     fb = "Excellent";
        else if (rbSuperb.isSelected ())   fb = "Superb";
        else    fb = "Fantastic";
        String msg = name + " " + fb;
JOptionPane.showMessageDialog(c, msg);
                    };
            btnSubmit.addActionListener(a);
            
            setTitle ("Success Story App");
            setSize (700, 500);
            setLocationRelativeTo (null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);


    }

}

class P4 {
    public static void main (String[] args){
        App2 app = new App2();
    }
    
}
