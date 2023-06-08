// append an existing file 
import java.io.*;

class P5 {
    public static void main(String[] args){

        Console c = System.console();
        String fn = c.readLine("Enter filename: ");
        File f = new File(fn);

        if (f.exists()){
            try{
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(fw);
            String data = c.readLine("Enter data: ");
            pw.println(data);
            pw.close();

            }catch (IOException e){
                System.out.println("issue : " + e);
            }


        }
        else{
            System.out.println(f + " File is not found ");
        }
    }
    
}
