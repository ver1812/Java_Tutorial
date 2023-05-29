//using for loop
import java.util.Scanner;

class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer ");
        int n = sc.nextInt();
        int sum = 0;
        if(n > 0)
        {
            for (int i = 1; i <= n; i++) {
            sum = sum + i;
            }
            System.out.println(sum);
        }
        else
        {
            System.out.println("Invalid");
        }
       
    }

    
}
