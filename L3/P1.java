// even odd using if else
import java.io.*;
class P1{
    public static void main(String[] args){
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("ENTER INTEGER "));
        if(num%2==0){
            System.out.println(num + " IS EVEN ");

        }
        else{
            System.out.println(num + " IS ODD ");
        }

        
    }
}