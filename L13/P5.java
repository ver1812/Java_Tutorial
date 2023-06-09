import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class App5 extends JFrame {
    Container c ;
    JLabel lab ;
    JTextField txt;
    JButton btn;

    App5(){
        c = getContentPane();
        c.setLayout(null);

        lab = new JLabel("Enter integer");
        txt = new JTextField(10);
        btn = new JButton("Find");

        Font f = new Font("Arial", Font.BOLD,40);
        lab.setFont(f);
        txt.setFont(f);
        btn.setFont(f);

        lab.setBounds(100,30,400,50);
        txt.setBounds(30,90,400,50);
        btn.setBounds(30,170,400,50);

        c.add(lab);
        c.add(txt);
        c.add(btn);

        ActionListener a = (ae) -> {
            try{
                String str = txt.getText();
                Integer num = Integer.parseInt(str);
                String res = num % 2 == 0 ? "Even" : "Odd";
                JOptionPane.showMessageDialog(c,res);

           }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(c,"Integers Only ", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt.setText("");
            txt.requestFocus();
           }

        };
        btn.addActionListener(a);


    }
}
    
    
    class P5 {
        public static void main(String[] args){
            App5 a = new App5();
            a.setTitle("Even Odd ");
            a.setSize(500,500);
            a.setLocationRelativeTo(null);
            a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            a.setVisible(true);
            

        }
    
}
