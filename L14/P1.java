import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class App1 extends JFrame{
    Container c;
    JButton btn;

    App1(){
        c = getContentPane ();
        c.setLayout (null);

        btn = new JButton ("Color me ");
        Font f = new Font("Arial", Font.BOLD,50);
        btn.setFont(f);
        btn.setBounds(100,100,300,60);
        c.add(btn);

        ActionListener l = (ae) ->{
            Color co[] = {Color.RED,Color.GREEN,Color.BLUE,Color.GRAY};
            int r = (int)(Math.random() * co.length);
            c.setBackground(co[r]);

        };
        btn.addActionListener(l);
    }
}

class P1 {
    public static void main(String[] args){
        App1 a = new App1();
        a.setTitle("Color me");
        a.setSize(500,500);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);

    }
}