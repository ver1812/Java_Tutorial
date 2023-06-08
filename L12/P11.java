// copy new file using nio library
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class P11 {
    public static void main(String[] args){
        Console c = System.console();
        String sf = c.readLine("Enter source filename : ");
        Path psf = Paths.get(sf);
        if(Files.exists(psf)){
            
            try{
                String df = c.readLine("Enter destination file : ");
                Path pdf = Paths.get(df);
                Files.copy(psf,pdf);

            }catch(IOException e){
                System.out.println("issue " + e);
            }
            
            
        }
        else{
            System.out.println(sf + " does not exists ");
        

        
    }
}
    
}
