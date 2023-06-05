import java.io.*;
import java.util.*;


class P10 {
    public static void main(String[] args) {
        Console c= System.console();
        ArrayList<Double> data = new ArrayList<Double>();

        String res = c.readLine("Would you like to add number ? y/n ");
        while (res.equals("y")) {
            double d = Double.parseDouble(c.readLine("Enter number : "));
            data.add(d);
            res = c.readLine("Would you like to add number? y/n ");
        }

        int c1 = 0 ,c2 = 0 ,c3 = 0 ;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) > 0) {
                c1++;
            } else if (data.get(i) < 0) {
                c2++;
            }else{
                c3++;
            }
            
        }
    }
    
}
