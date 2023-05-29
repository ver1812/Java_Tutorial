// to find average marks of n students 

import java.util.Scanner;

class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter size of array ");
        int n = sc.nextInt();
        System.out.println("Enter numbers of array ");
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }
        System.out.println("Average = " + (sum / n));
    }
    
}
