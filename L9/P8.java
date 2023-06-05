import java.io.Console;
import java.util.ArrayList;

class P8 {
    public static void main(String[] args){
        Console c = System.console();
        ArrayList<String> diary = new ArrayList<String>();

        String res = c.readLine("Would you like to order food ? y/n ");
        while(res.equals("y"))
        {
            String name = c.readLine("Enter food name :");
            diary.add(name);
            res = c.readLine("Would you like to order food? y/n ");
        }
        System.out.println("diary : " + diary);
        
        
    }
    
}
