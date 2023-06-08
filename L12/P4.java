// delete an existing file 
import java.io.*;

class P4 {
    public static void main(String[] args){

        Console c = System.console();
        String fn = c.readLine("Enter filename: ");
        File f = new File(fn);

        if (f.exists()){
            f.delete();
            System.out.println(f + " File is deleted ");


        }
        else{
            System.out.println(f + " File is not found ");
        }
    }
    
}
