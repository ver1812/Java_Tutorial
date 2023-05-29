// factorial of number using do while loop

import java.util.Scanner;

class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer ");
        int n = sc.nextInt();
        int fact = 1;
        do {
            fact = fact * n;
            n--;
        } while (n > 0);
        System.out.println(fact);
        sc.close();


    }
    
}
