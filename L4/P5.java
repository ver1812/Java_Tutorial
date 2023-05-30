import java.io.*;
class P5 {
public static void main(String[] args) {
    Console c = System.console();

    String name = new String(c.readLine("Enter your name "));
    System.out.println("Hello " + name);

    for (int i = 0; i < name.length(); i++) {
        System.out.print(name.charAt(i));
    }
    System.out.println();

    char ch[] = name.toCharArray();
    for (int i = 0; i < ch.length; i++) {
        System.out.print(ch[i]);
    }
}
    
}
