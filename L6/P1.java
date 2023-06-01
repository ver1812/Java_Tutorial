import java.io.*;
class EvenOdd
{
    int num ;

    void setData(int n)
    {
        num = n ;
    }
    void showData(){
        System.out.println("num : " + num);
    }
    void check()
    {
        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

class P1
{
    public static void main(String args[]){
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter the number "));

        EvenOdd e = new EvenOdd();
        e.setData(num);
        e.showData();
        e.check();
    }
}