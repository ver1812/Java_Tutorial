import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class App extends JFrame{
    Container c ;
    JButton btnRed , btnGreen ;

    App(){
        c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        btnRed = new JButton("Red");
        btnGreen = new JButton("Green");

        Font f = new Font("Calibri",Font.BOLD,40);
        btnRed.setFont(f);
        btnGreen.setFont(f);

        c.add(btnRed);
        c.add(btnGreen);

        ActionListener a1 = (ae) -> {c.setBackground(Color.RED);};
        btnRed.addActionListener(a1);
        
        ActionListener a2 = (ae) -> {c.setBackground(Color.GREEN);};
        btnGreen.addActionListener(a2);

    }
}


class P2 {
    public static void main(String args[]){
        App a = new App();
        a.setSize(250,400);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);
    }
    
}
