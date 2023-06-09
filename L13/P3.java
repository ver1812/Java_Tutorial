import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class App extends JFrame{
    Container c ;
    JButton btnClickMe;

    App(){
        c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER,0,20));
        btnClickMe = new JButton("Click Me");
        Font f = new Font("Times New Roman",Font.PLAIN,50);
        btnClickMe.setFont(f);
        c.add(btnClickMe);

        ActionListener a = (ae) -> {
            JOptionPane.showMessageDialog(c,"Good Afternoon");

        };
        btnClickMe.addActionListener(a);
    }
}

class P3{
    public static void main(String []args ){
        App a = new App();
        a.setTitle("App by Vighnesh Sadvilkar ");
        a.setSize(500,500);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);

    }
}