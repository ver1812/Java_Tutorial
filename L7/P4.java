import java.io.Console;

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void show() {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
    }


}

class Sales extends Employee{
    private double commission;
    public Sales(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }
    public void show() {
        super.show();
        System.out.println("commission:"+commission);
    }
}


class P4 {
    public static void main(String[] args) {
        Console c = System.console();
        // take size of array 
        int size = Integer.parseInt(c.readLine("Enter size of array "));
        // create array
        Employee[] employee = new Employee[size];
        // create array of sales
        Sales[] sales = new Sales[size];

        for (int i = 0; i < size; i++) {
            String name = c.readLine("Enter name of employee " + i);
            double salary = Double.parseDouble(c.readLine("Enter salary of employee " + i));
            int id = Integer.parseInt(c.readLine("Enter id of employee " + i));
            employee[i] = new Employee(id, name, salary);
            sales[i] = new Sales(id, name, salary, Double.parseDouble(c.readLine("Enter commission of employee " + i)));
        }
        for (int i = 0; i < size; i++) {
            employee[i].show();
            sales[i].show();
        }
        


        
    }
    
}
