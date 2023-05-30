import java.io.Console;
import java.util.*;

class P1{
    public static void main(String[] args){
        Console c = System.console();
        // array size 
        int n = Integer.parseInt(c.readLine("ENTER SIZE OF ARRAY "));
        // create array 
        String[] names = new String[n];
        for(int i = 0; i < n; i++){
            names[i] = c.readLine("ENTER NAMES ");

        }
      //  System.out.println(Arrays.toString(names));
      
      //display the elements using for 
      for(int i = 0; i < n; i++){
          System.out.println(names[i] + " " );
      }
      // another method 
      for(String naString : names){
        System.out.println(naString + " " );
      }

      //sort the array
      Arrays.sort(names);
      //display the sorted array
      for(String na : names){
          System.out.println(na + " " );
      }
    





        
    }
}