import java.util.Scanner;

class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer ");
        int n = sc.nextInt();

        if(n>0)
        {
            int i =1, sum =0;
            while(i<=n)
            {
                sum += i;
                i += 1;
            }
            System.out.println("sum = " + sum);

        }
        else
        {
            System.out.println("Invalid input");
        }

       
    }
    
}
