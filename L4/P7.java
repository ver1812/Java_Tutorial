import java.io.*;

class P7 {
    public static void main(String[] args) {
        Console c = System.console();
        String str = new String(c.readLine("Enter string "));
        System.out.println(str);
        int c1=0 , c2=0, c3=0;
        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);
            if(Character.isLetter(ch))  c1++;
            else if(Character.isDigit(ch)) c2++;
            else  c3++;

        }
        System.out.println("Letters : " + c1);
        System.out.println("Digits : " + c2);
        System.out.println("Special Characters : " + c3);

    }
    
}
