import java.util.*;
import java.io.*;

class P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: " );
        int n = in.nextInt();
        //create array
        double data[] = new double[n];
        //scan array
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++) {
            data[i] = in.nextDouble();
        }
        System.out.println(Arrays.toString(data));
        //count 
        // c1 = zero count 
        //c2 positive count
        //c3 negative count
        int c1=0 , c2=0 , c3=0 ;
        for(int i=0; i<n; i++) {
            if(data[i]>0) {
                c2++;
            }
            else if(data[i]<0) {
                c3++;
            }
            else {
                c1++;
            }

        }
        System.out.println("zero count is : " + c1);
        System.out.println("positive count is : " + c2);
        System.out.println("negative count is : " + c3);


        
    }
    
}
