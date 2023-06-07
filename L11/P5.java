import java.io.*;
import java.util.*;


class P5 {
    public static void main(String[] args) {
        Console c = System.console();

        HashMap<String, String> con = new HashMap<>();
        con.put("hi","hello");
        con.put("bye","goodbye");
        con.put("hello","hi");
        con.put("goodbye","bye");
        con.put("java","july");
        con.put("days","Sat & Sun");
        con.put("time","3 to 6 pm");
        con.put("fees","12000");

        while(true) {
            String qts = c.readLine("Enter ur qts or press q for quit ");
            if(qts.equals("q")) {
                break;
            }
            else if(con.get(qts) != null) {
                String ans = con.get(qts);
                System.out.println(ans);
            }else{
                System.out.println("Invalid input");
            }
        }
    }
    
}
