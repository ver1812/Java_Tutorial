interface Mymath{
    double sqrt(double num) ;
}
public class P10{
    public static void main(String[] args) {
        Mymath m1 = (double num) -> {return Math.sqrt(num); };
        m1.sqrt(10);

        
    }
    
}
