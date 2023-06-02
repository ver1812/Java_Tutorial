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
class Student extends Person{
    private int marks;
    public Student(int id, String name, int marks){
        super(id, name);
        this.marks = marks;
    }
    public void show(){
        super.show();
        System.out.println("marks : " + marks);
    }


}


class P5 {
    public static void main(String[] args) {
        Person p = new Person(1, "Sumit");
        p.show();
        Student s = new Student(10, "Amit",50);
        s.show();

    }
    
}
