// find number of vowels and consonants using switch case

import java.io.Console;

class P3 {
    public static void main(String[] args){
        Console c = System.console();
        String str = new String(c.readLine("Enter your string "));
        int vc = 0 , cc = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(i)){
                switch(ch) {
                    case 'a','e','i','o','u','A','E','I','O','U' -> vc++; 
                    
                    default  -> cc++;
                }

    
            }
        }
        System.out.println("Number of vowels: " + vc);
        System.out.println("Number of consonants: " + cc);

        
    }
}
