import java.io.*;

class P5
{
    public static void main(String[] args)
    {
        Console c = System.console();
int n1 = Integer.parseInt (c.readLine("enter first integer "));
int n2 = Integer.parseInt (c.readLine("enter second integer "));
int res = n1 + n2;
System.out.println("res of addition = " + res);
    }
}