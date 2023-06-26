package App;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SplashFrame extends JFrame {
    Container c;
    JLabel labAbout;

    SplashFrame() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        labAbout = new JLabel("This is a splash screen");
        labAbout.setBounds(100, 100, 200, 30);
        labAbout.setForeground(Color.WHITE);
        c.add(labAbout);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Splash Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    
}
