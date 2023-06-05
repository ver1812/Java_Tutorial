import java.io.*;
class P5 {
    public static void main(String[] args) {
        Console c = System.console();
        try {
        int a = Integer.parseInt(c.readLine("Enter first integer "));
        int b = Integer.parseInt(c.readLine("Enter second integer "));
        int ans = a/b;
        System.out.println("ans = " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Second number cannot be zero ");

        }catch (NumberFormatException e) {
            System.out.println("Invalid input : Integers Only ");
        }



    }
    
}
