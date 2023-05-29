import java.io.Console;

class P3 {
    public static void main(String[] args) {
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("enter integer "));
        switch (num % 2) {
            case 0 ->
                System.out.println("even");
                
            case 1 ->
                System.out.println("odd");
              
            case -1 ->
                System.out.println("odd");
                
        }
    }
            
    
}
