//check for palindrome
import java.io.Console;

class P4 {
    public static void main(String[] args) {
        Console c = System.console();
        String str = new String(c.readLine("Enter string "));
        // reverse the string
        String nstr ="";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            nstr = ch + nstr;


        }

        if(str.equals(nstr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        
    }
    
}
