// create new file using nio library
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class P9 {
    public static void main(String[] args){
        Console c = System.console();
        String fn = c.readLine("Enter filename : ");
        Path p = Paths.get(fn);
        if(Files.exists(p)){
            System.out.println(fn + " already exists ");
            
        }
        else{
            try {
                Files.createFile(p);
                System.out.println(fn + "created ");

            }catch (IOException e){
                System.out.println("issue " + e );
            }
        }
        

        
    }
    
}
