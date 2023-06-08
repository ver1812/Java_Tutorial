import java.io.*;

class P1{
    public static void main(String[] args) {
        Console c = System.console();
        String fn = c.readLine("enter filename ");
        File f = new File(fn);

        if (f.exists()){
            System.out.println(fn + " exists ");
        }
        else{
            System.out.println(fn + " does not exist ");
        }



    }
}