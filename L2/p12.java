import java.io.*;
class p12 {
    public static void main(String[] args) {
        Console c = System. console();
        int fb = Integer.parseInt(c.readLine ("enter feedback "));
        switch (fb) {
            case 5, 4 : System.out.println("Good"); break;
            case 3, 2 : System.out.println("Ok"); break;
            case 1 : System.out.println("Poor"); break;
            default : System.out.println("Invalid");break;
        }
    }

    
}
