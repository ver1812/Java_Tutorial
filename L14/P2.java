import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class App2 extends JFrame{
    Container c;
    JLabel labNumber, labAnswer;
    JTextField txtNumber;
    JButton btnSquare, btnCube;

    App2(){
        c = getContentPane();
        c.setLayout(null);

        labNumber = new JLabel("enter number ");
        labAnswer = new JLabel("");
        txtNumber = new JTextField (10);
        btnSquare = new JButton ("Square");
        btnCube = new JButton ("Cube");

        Font f = new Font ("Arial", Font.BOLD, 30);
        labNumber. setFont (f); 
        labAnswer.setFont (f); 
        txtNumber.setFont (f); 
        btnSquare.setFont(f); 
        btnCube.setFont (f);

        labNumber.setBounds(100,100,300,50);
        txtNumber.setBounds (400, 100, 300, 50);
        btnSquare.setBounds (200, 200, 200, 50);
        btnCube. setBounds (500, 200, 200, 50); 
        labAnswer.setBounds (400, 300, 300, 50);

        c.add(labNumber);
        c.add (labAnswer);
        c.add (txtNumber);
        c.add (btnSquare);
        c.add(btnCube);

        ActionListener a1 = (ae) -> {
            try{
                double num = Double.parseDouble(txtNumber.getText());
                double res = num * num ;
                String msg = "square = " + String. format ("%.2f", res);
                labAnswer.setText((msg));


            }catch(NumberFormatException e){
                labAnswer.setText(("Numbers Only"));

            }
        };
        ActionListener a2 = (ae) -> {
            try{
                double num = Double.parseDouble(txtNumber.getText());
                double res = num * num * num;
                String msg = "Cube = " + String.format ("%.2f", res);
                labAnswer.setText((msg));


            }catch(NumberFormatException e){
                labAnswer.setText(("Numbers Only"));

            }
        };
        
        btnSquare.addActionListener(a1);
        btnCube.addActionListener(a2);


    }

}
class P2 {
    public static void main(String[] args){
        App2 a = new App2();
        a.setTitle("Square & Cube Finder ");
        a.setSize(1000,500);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);

    }
}