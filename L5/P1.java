import java.io.*;
class P1{
    public static void main(String[] args) {
        Console c =System.console();
        String name = new String(c.readLine("Enter your name : "));
        if (name.trim().length() == 0) {
            System.out.println("Name cannot be only spaces");
        }
        else if(name.trim().length() <2)
        {
            System.out.println("name should only contain alphabets");
        }
        
        else if(! name.matches("[a-zA-Z\\s]+"))
        {
            System.out.println("name should only contain alphabets");
            
        }
        else
        {
            String msg = "Welcome " + name ;
        System.out.println(msg);
        }
        
    }
}