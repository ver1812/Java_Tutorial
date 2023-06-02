import java.io.Console;

class Product {
    private String ID;
    private String name;
    private Double price ;
    private static String cn = "Ver Publication";

    public Product(String ID, String name, Double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }
    public void Show(){
        System.out.println("");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Manufacturer: " + cn);
    }
}

class P1{
    public static void main(String[] args) {
        Console c = System.console();
        String ID ,name;
        Double price;
        ID = c.readLine("Enter ID: ");
        name = c.readLine("Enter name: ");
        price = Double.parseDouble(c.readLine("Enter price: "));

        Product p = new Product(ID, name, price);
        System.out.println("");
        p.Show();
        System.out.println("");
        
    }
}