import java.util.Scanner;

class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer ");
        int n = sc.nextInt();

        if(n >0 )
        {
            int i = 1,sum = 0;
            do
            {
                sum += i;
                i++;

            }while(i < n);
            System.out.println(sum);
        }
        else
        {
            System.out.println("Invalid");
        }
        

    }
    
    
}
