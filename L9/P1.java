import java.io.*;
import java.util.InputMismatchException;

class P1{
    public static void main(String[] args) {
        System.out.println("Good Afternoon ");
        Console c = System.console();


        try{
        int num = Integer.parseInt(c.readLine("Enter integer "));
        
        String res = num % 2 == 0 ? "Even " : "Odd";
        System.out.println(res);
        }catch(InputMismatchException e){
            System.out.println("Invalid Input");
        }
        System.out.println("Bye");

        
    }
}