import java.io.*;

class rectangle{
    private double length , breadth ;

    public rectangle(double length, double breadth){
        this.length = length ;
        this.breadth = breadth ;
    }
    public void area() {
        System.out.println("area = " + length * breadth);
    }
    public void perimeter() {
        System.out.println("perimeter = " + 2 * length + 2 * breadth);
    }

}



class P6 {
    public static void main(String[] args) {
        Console c = System.console();
        double length = Double.parseDouble(c.readLine("Enter the length "));
        double breadth = Double.parseDouble(c.readLine("Enter the breadth "));

        if ((length>0.0)&&(breadth>0.0)){
            rectangle r = new rectangle(length, breadth);
            r.area();
            r.perimeter();
        }
        else{
            System.out.println("Invalid input");
        }
    }
    
}
