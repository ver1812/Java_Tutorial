import java.io.*;

class P2{
    public static void main(String[] args) {
        Console c = System.console();
        String fn = c.readLine("enter filename ");
        File f = new File(fn);

        if (f.exists()){
            System.out.println(fn + " exists ");
        }
        else{
            try{
                f.createNewFile();
                System.out.println(fn + " created ");

            }catch (IOException e){
                System.out.println("issue " + e);
            }
        }



    }
}