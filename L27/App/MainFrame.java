package App;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainFrame extends JFrame {
    Container c;
    JLabel labAbout;
    JButton btnStart;
    MainFrame() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        labAbout = new JLabel("This is a Main screen");
        labAbout.setBounds(100, 100, 200, 30);
        labAbout.setForeground(Color.WHITE);
        c.add(labAbout);
        btnStart = new JButton("Start");
        btnStart.setBounds(100, 150, 100, 30);
        btnStart.setForeground(Color.WHITE);
        btnStart.setBackground(Color.BLACK);
        c.add(btnStart);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Splash Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
 

    
}
