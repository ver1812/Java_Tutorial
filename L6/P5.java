import java.io.*;

class SquareRoot{
    private double num;
    public SquareRoot(double num){
        this.num = num;
    }
    public void show () {
        System.out.println("Number = " + num);
    }
    public void ShowRoot(){
         
         System.out.println("Sqrt = " + Math.sqrt(num));


        
    }


}

class P5 {
    public static void main(String[] args) {
        Console c = System.console();
        double num = Double.parseDouble(c.readLine("Enter the number "));
        if (num > 0.0){

        SquareRoot s = new SquareRoot(num);
        s.show();
        s.ShowRoot();
        }
        else{
            System.out.println("Enter a positive number");
        }

    }
    
}
