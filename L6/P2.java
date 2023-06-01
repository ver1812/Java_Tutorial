import java.io.*;
class EvenOdd {
    private int num;

    public EvenOdd(int n) {
        num = n;
    }

    public void showData() {
        System.out.println("num: " + num);
    }

    public void check() {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}



class P2{
    public static void main(String[] args) {
    Console c = System.console();
    int num = Integer.parseInt(c.readLine("Enter the number "));

    EvenOdd a = new EvenOdd(num);
    a.showData();
    a.check();
    }


    
}
