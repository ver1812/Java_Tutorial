import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class App1 extends JFrame {
    Container c;
    JLabel labNumber;
    JTextField txtNumber;
    JButton btnSquare, btnCube;

    App1(){
        c = getContentPane();
        c.setLayout(null);
        labNumber = new JLabel("enter number ");
        txtNumber = new JTextField (10);
        btnSquare = new JButton("Square ");
        btnCube = new JButton("Cube");
        Font f = new Font("Arial", Font.BOLD, 40);
        labNumber.setFont(f); 
        txtNumber.setFont(f); 
        btnSquare.setFont(f); 
        btnCube.setFont(f);
        labNumber.setBounds(50, 50, 300, 50); 
        txtNumber.setBounds(350, 50, 300, 50); 
        btnSquare.setBounds(100, 150, 200, 50); 
        btnCube.setBounds(350, 150, 200, 50);

        c.add(labNumber);
        c.add(txtNumber);
        c.add(btnSquare);
        c.add(btnCube);

        ActionListener a1 = (ae) -> {
            try{
                double num = Double.parseDouble(txtNumber.getText());
                double res = num * num;
                String msg = "square = " + String.format ("%.2f", res);
                JOptionPane.showMessageDialog(c, msg);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(c, "numbers only");
                txtNumber.setText(""); 
                txtNumber.requestFocus();
            }
        };btnSquare.addActionListener(a1);

        ActionListener a2 = (ae) -> {
            try{
                double num = Double.parseDouble(txtNumber.getText());
                double res = num * num * num;
                String msg = "Cube = " + String.format ("%.2f", res);
                JOptionPane.showMessageDialog(c, msg);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(c, "numbers only");
                txtNumber.setText(""); 
                txtNumber.requestFocus();
            }
        };btnCube.addActionListener(a2);

        setTitle("Calci by Vighnesh");
        setSize (1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible (true);


    }

}
