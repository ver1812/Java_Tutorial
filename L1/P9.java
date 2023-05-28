import java.io.*;
class P9
{
    public static void main(String[] args)
    {
        Console c = System.console();
        double length = Double.parseDouble(c.readLine("Enter length "));
        double width = Double.parseDouble(c.readLine("Enter width "));
        if ((length > 0.0) && (width >0.0))
        {
            double area = length * width;
            System.out.println("Area = " + String.format("%3f", area));
            double perimeter = 2 *(length + width);
            System.out.println("Perimeter = " + perimeter);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}