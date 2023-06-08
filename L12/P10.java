// delete new file using nio library
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class P10 {
    public static void main(String[] args){
        Console c = System.console();
        String fn = c.readLine("Enter filename : ");
        Path p = Paths.get(fn);
        if(Files.exists(p)){
            try{
                Files.delete(p);
                System.out.println(fn + "deleted ");

            }catch(IOException e){
                System.out.println("issue " + e);
            }
            
            
        }
        else{
            System.out.println(fn + " does not exists ");
        

        
    }
}
    
}
