//to read ArrayList of number and print their sum and average 
import java.io.*;
import java.util.*;

class P3{
    public static void main(String args[]){
        Console c = System.console();
        ArrayList<Double> data  = new ArrayList<Double>();

        String res = c.readLine("Do you want to add number ? y/n");
        while(res.equals("y")){
            data.add(Double.parseDouble(c.readLine("Enter number: ")));
            res = c.readLine("Do you want to add number? y/n");
        }
        double sum = 0;
        double avg = 0;
        for(int i = 0; i < data.size(); i++){
            sum += data.get(i);
        }
        avg = sum/data.size();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

    }
}