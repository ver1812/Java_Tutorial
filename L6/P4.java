import java.io.*;

class Square{
    private double num;
    public Square(double num) {
        this.num = num;
    }

    public void showNumber(){
        System.out.println(num);

    }
    public double compute(){
        return num*num;
    }
}

class P4 {
    public static void main(String[] args) {
        Console c = System.console();
        double num = Double.parseDouble(c.readLine("Enter the number "));

        Square s = new Square(num);
        s.showNumber();
        System.out.println(s.compute());
    }
    
}
