import java.util.*;
import java.io.*;

class P9 {
    public static void main(String[] args) {
        Console c = System.console();
        String str = new String(c.readLine("Enter your string "));
        System.out.println(str);

        char ch[] = str.toCharArray();

        Arrays.sort(ch);

        str = new String(ch);
        System.out.println(str);
        


    }
    
}
