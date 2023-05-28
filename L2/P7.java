import java.io.*;

class P7 {
    public static void main(String[] args) {
        Console c = System.console();
        double age = Double.parseDouble(c.readLine("Enter age "));
        if (age >= 18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }
    }
    
    
}
