import java.io.*;

public class P5 {

    public static void main(String[] args) {
        Console c = System.console();
        int n1 = Integer.parseInt(c.readLine("Enter first Integer "));
        int n2 = Integer.parseInt(c.readLine("Enter second Integer "));
        System.out.println("res = "+ (n1+n2) );

    }
    
}
