import java.io.*;
class P3 {
    public static void main(String[] args) {

        
        try{
        double num = Double.parseDouble(args[0]);
        if (num > 0.0)
        {
            double res = Math.sqrt(num);
            System.out.println("res = " + res);

        }
        else{
            System.out.println("Invalid input");
        }
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("You need to enter number ");
    }
    catch(NumberFormatException e){
        System.out.println("You need to enter numbers only"); 
    }
    
}}
