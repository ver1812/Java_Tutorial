import java.io.*;
import java.util.*;
class P9 {
    public static void main(String[] args) {
        Console c= System.console();
        ArrayList<Integer> marks = new ArrayList<Integer>();

        String res = c.readLine("Do you want to enter marks ? y/n ");
        while(res.equals("y")){
            int m = Integer.parseInt(c.readLine("Enter marks "));

            marks.add(m);
            res = c.readLine("Do you want to enter marks ? y/n ");
        }

        //sort ArrayList 
        Collections.sort(marks);

        System.out.println(marks);
        //lowest
        System.out.println(marks.get(0));
        //System.out.println(Collections.min(marks));
        //highest
        System.out.println(marks.get(marks.size()-1));
        //System.out.println(Collections.max(marks));
    }
    
}
