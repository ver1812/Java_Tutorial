import java.io.*;
class P7
{
    public static void main(String[] args)
    {
        Console c = System.console();
        double n1 = Double.parseDouble(c.readLine("Enter first number"));
        double n2 = Double.parseDouble(c.readLine("Enter second number"));
        double n3 = Double.parseDouble(c.readLine("Enter third number"));
        double avg = (n1 + n2+ n3) /3;
        System.out.println("avg = " + avg);
        System.out.println(String.format("%.2f",avg));
        System.out.println(String.format("%.3f",avg));
    }
    
}