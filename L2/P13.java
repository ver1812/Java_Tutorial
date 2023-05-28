 import java.io.*;
 class P13 {
    public static void main(String[] args){
        Console c = System. console();
        int fb = Integer.parseInt(c.readLine ("enter feedback "));
        switch(fb)
        {
            case 5 , 4 -> System.out.println("Good ") ;
            case 3, 2 -> System.out.println("Ok") ;
            case 1 -> System.out.println("Bad") ;
            default -> System.out.println("Invalid");
        }
    }
    
}
