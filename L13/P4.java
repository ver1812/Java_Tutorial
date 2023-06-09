import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class App4 extends JFrame {
    Container c ;
    JLabel lab ;
    JTextField txt;
    JButton btn;

    App4(){
        c = getContentPane();
        c.setLayout(null);

        lab = new JLabel("Enter name : ");
        txt = new JTextField(20);
        btn = new JButton("Sbmit");

        Font f= new Font("Arial", Font.BOLD,50);
        lab.setFont(f);
        txt.setFont(f);
        btn.setFont(f);

        lab.setBounds(300,20,500,60);
        txt.setBounds (200, 100, 500, 60);
        btn.setBounds (300, 200, 300, 60);
        c.add(lab);
        c.add(txt);
        c.add(btn);

        ActionListener a = (ae) -> {
            String name = txt.getText();
            if((name.trim().length() == 0)){
                JOptionPane.showMessageDialog(c, " NAME CANNOT BE EMPTY ");
                txt.setText("");
                txt.requestFocus();

            }else if( ! name.trim().matches("[a-zA-Z ]+") ){
                JOptionPane.showMessageDialog(c, " NAME should only contain alphabets ");
                txt.setText("");
                txt.requestFocus();
            }else{
                String msg = "Welcome " + name ;
                JOptionPane.showMessageDialog(c,msg);
            }
        };
        btn.addActionListener(a);




    }
}

class P4 {
    public static void main (String [] args ){
        App4 a = new App4();
        a.setSize (900, 500);
        a.setIconImage (new ImageIcon("k.png").getImage());
        a.setTitle("Welcome App by Vighnesh ");
        a.setLocationRelativeTo (null);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        a.setVisible (true);

    }

    
}
