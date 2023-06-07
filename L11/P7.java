import java.io.*;
import java.util.*;

class P7 {
    public static void main(String[] args) {
        Console c = System.console();
        HashMap<String,String> pb = new HashMap<String,String>();

        pb.put("amit", "468");
        pb.put("sumit", "79090"); 

        String name = c.readLine("enter name ");
        if(pb.get(name) != null){
            System.out.println(pb.get(name));

        }
        else{
            System.out.println("not found");

        }
    }
    
}
