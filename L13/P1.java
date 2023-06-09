import javax.swing.*;
import java.awt.*;

class App extends JFrame {
    Container c ;
    JLabel lab ;

    App(){
        c = getContentPane();
        lab = new JLabel("GOOD AFTERNOON ", JLabel.CENTER);
        Font f = new Font("Arial", Font.BOLD,50);
        lab.setFont(f);
        lab.setForeground(Color.RED);
        c.add(lab);



    }


}

class P1{
    public static void main(String[] args){
        App a = new App();
        a.setSize(500,300);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);

    }
}