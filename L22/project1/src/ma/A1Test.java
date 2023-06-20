package ma;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

class A1 extends JFrame implements ActionListener {

    Container c;
    JButton btnClick;
    JLabel labImage;

    A1(){
        c = getContentPane();
        c.setLayout (null);
        btnClick = new JButton("Click Me");
        labImage = new JLabel (new ImageIcon ("sagar. jpg"));
        labImage. setBounds (0, 0, 500, 500); 
        btnClick.setBounds (100, 100, 300, 50);
        Font f = new Font("Arial", Font. BOLD, 50);
        btnClick.setFont (f); c.add(labImage);
        c.add (btnClick);
        btnClick.addActionListener(this);

        setSize (500, 500); setLocation (100, 100);
        setTitle("My First App");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent ae){
        LocalTime t = LocalTime.now();
        int hr = t.getHour ();
        String msg = "";
        if (hr < 12)
            msg = "Good Morning";
        else if (hr < 16)
            msg = "Good Afternoon";
        else if (hr < 20)
            msg = "Good Evening";
        else
            msg = "Good Night";
        
        JOptionPane.showMessageDialog (c, msg);
    }

}

class A1Test {
    public static void main(String[] args) {
        A1 a = new A1();
    }
}