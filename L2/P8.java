import java.io.Console;

class P8 {

    public static void main(String[] args){
        Console c = System.console();
        double age = Double.parseDouble(c.readLine("Enter age: "));
        Double weight = Double.parseDouble(c.readLine("Enter weight: "));

        boolean bage = (age >= 25) && (age <= 45);
        boolean bwt = (weight >=50) && (weight <= 75);

        if (bage && bwt) {
            System.out.println("You can donate blood ");
        }
        else {
            System.out.println("You can't donate blood ");
        }

    }
    

    
}
