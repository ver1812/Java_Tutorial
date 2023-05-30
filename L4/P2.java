import java.util.*;
import java.io.*;


class P2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : " );
        int n = sc.nextInt();
        //create array
        int[] marks = new int[n];
        //scan array
        System.out.println("Enter marks : " );
        for(int i = 0; i < n; i++){
            marks[i] = sc.nextInt();
        }
        //sort array
        Arrays.sort(marks);
        for(int i = 0; i < n; i++){
            System.out.print(marks[i] + " ");
        }
        //find lowest and highest marks
        int low = marks[0];
        int high = marks[n-1];
        System.out.println("Lowest Mark : " + low);
        System.out.println("Highest Mark : " + high);
        
    }
}
