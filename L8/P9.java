interface Mymath{
    void sqrt(double num) ;
}
public class P9 {
    public static void main(String[] args) {
        Mymath m1 = (double num) -> {System.out.println("res = " + Math.sqrt(num)); };
        m1.sqrt(10);

        Mymath m2 = ( num) -> {System.out.println("res = " + Math.sqrt(num)); };
        m2.sqrt(170);
    }
    
}
