//even odd using conditional operators
import java.io.*;
class P4 {
    public static void main(String[] args) {
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter a number "));
        String res = num % 2 == 0 ? "even" : "odd";
        System.out.println(res);
       
    }
    
}
