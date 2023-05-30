import java.io.*;
class P8 {
    
    public static void main(String[] args) {
        Console c = System.console();
        String str = new String(c.readLine("Enter string "));
        System.out.println(str);
        int c1=0 , c2=0;
        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))  c1++;
            else if(Character.isLowerCase(ch)) c2++;
            

        }
        System.out.println("Uppercase : " + c1);
        System.out.println("LowerCase : " + c2);
       

    }
}
