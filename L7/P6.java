class  Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void show(){
        System.out.println("id : " + id);
        System.out.println("name : " + name);
    }
}

class Teacher extends Person{
    private Double salary;
    public Teacher(int id, String name, Double salary){
        super(id, name);
        this.salary = salary;
    }
    public void show(){
        super.show();
        System.out.println("salary : " + salary);
    }

}

class Hod extends Teacher{
    private String dept;
    public Hod(int id, String name, Double salary, String dept){
        super(id, name, salary);
        this.dept = dept;
    }
    public void show(){
        super.show();
        System.out.println("dept : " + dept);
    }

}


class P6 {
    public static void main(String[] args) {
        Hod hod = new Hod(1, "hod", 10000.0, "IT");
        hod.show();
    }
    
}
