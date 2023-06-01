import java.io.*;

class Square{
    double num;

    void setNumber(double n) {
        num = n;
    }
    double getNumber() {
        return num;
    }
    double compute(){
        return num*num;
    }
}
class P3 {
    public static void main(String[] args) {
        Console c = System.console();
        double num = Double.parseDouble(c.readLine("Enter the number "));

        Square s = new Square();
        s.setNumber(num);
        
        System.out.println(s.getNumber());

        System.out.println(s.compute());
    }

}
    

