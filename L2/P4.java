import java.io.*;

class P4 {
    public static void main(String[] args) {
            Console c = System.console();
            System.out.println("Enter first integer ");
            String s1 = c.readLine();
            int n1 = Integer.parseInt(s1);
            System.out.println("Enter second integer ");
            String s2 = c.readLine();
            int n2 = Integer.parseInt(s2);

            int res = n1 + n2;
            System.out.println("res =" + res);


        }
    
}
