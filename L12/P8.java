// make copy of existing file 
import java.io.*;

class P8 {
    public static void main(String[] args){

        Console c = System.console();
        String fn = c.readLine("Enter source filename: ");
        File f = new File(fn);
        String dn = c.readLine("Enter destination filename: ");
        File fd = new File(dn);

        if (f.exists()){
            try{
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                FileWriter fw = new FileWriter(fd);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(fw);
            
            

                String data = br.readLine();

                while (data != null){
                    pw.println(data);
                    pw.close();
                data = br.readLine();
                }
                br.close();
                System.out.println("File Copied !");

            

            }catch (IOException e){
                System.out.println("issue : " + e);
            }


        }
        else{
            System.out.println(f + " File is not found ");
        }
    }
    
}
