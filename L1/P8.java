import java.io.*;
class P8
{
    public static void main(String[] args)
    
    {
        Console c = System.console();
        double radius = Double.parseDouble(c.readLine("enter radius "));
        if (radius>0.0)
        {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is " + area);
        double circumference = Math.PI * radius * radius;
        System.out.println("Circumference of circle is " + circumference);
        }
        else
        {
            System.out.println("Enter a positive number");
        }
    }
}