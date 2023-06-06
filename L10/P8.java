import java.io.*;
import java.util.*;
public class P8 {
    public static void main(String[] args) {
        Console c = System.console();
        LinkedHashSet<String> names = new LinkedHashSet<String>();
        while(true)
        {
        int op = Integer.parseInt(c.readLine ("1 add, 2 remove, 3 show and 4 exit "));
        if (op == 1) {
            String n = c.readLine("enter team name ");
            if (names.add(n))
            System.out.println(n + " added ");
            else
            System.out.println(n + " already present ");

        }
        else if (op == 2) {
            String n = c.readLine("enter team name ");
            if (names.remove(n))
            System.out.println(n + " removed ");
            else
            System.out.println(n + " not present ");

        }
        else if (op == 3) {
            System.out.println(names);

        }
        else if (op == 4){
            break;
        }
        else{
            System.out.println("invalid input");
        }



        
}
}
}
    

