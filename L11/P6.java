import java.io.*;
import java.util.*;

class P6 {
    public static void main(String[] args) {
        Console c = System.console();
        String str = c.readLine("enter a string ");

        LinkedHashMap<String, Integer> cc = new LinkedHashMap<>();
        String data[] = str.split("");
        for(String d : data ){
            if(cc.get(d) == null)
            {
                cc.put(d, 1);
            }
            else{
                cc.put(d, cc.get(d)+1);
            }

        }



    }
    
}
