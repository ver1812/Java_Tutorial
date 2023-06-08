// read an existing file 
import java.io.*;

class P5 {
    public static void main(String[] args){

        Console c = System.console();
        String fn = c.readLine("Enter filename: ");
        File f = new File(fn);

        if (f.exists()){
            try{
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String data = br.readLine();
            while (data != null){
                System.out.println(data);
                data = br.readLine();
            }
            br.close();
            
            

            }catch (IOException e){
                System.out.println("issue : " + e);
            }


        }
        else{
            System.out.println(f + " File is not found ");
        }
    }
    
}
