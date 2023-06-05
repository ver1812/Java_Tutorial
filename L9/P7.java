import java.io.Console;

class Student{
    private int rno;
    private String name;
    private int marks ;
    public Student(int rno, String name, int marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    public void show(){
        System.out.println("rno:"+rno);
        System.out.println("name:"+name);
        System.out.println("marks:"+marks);
    }
}
class P7 {
    public static void main(String[] args) {
        Console c = System.console();
        try{
            int rno = Integer.parseInt(c.readLine("Enter rno "));
            if(rno <1)
            {
                throw new Exception("min should be one ");
            }
            String name = new String(c.readLine("Enter name "));
            if(name.trim().length() <2){
                throw new Exception("min should be two ");
            }
            if(! name.trim().matches("[A-Za-z ]+")){
                throw new Exception("name should be alphabets ");
            }
            int marks = Integer.parseInt(c.readLine("Enter marks "));
            if(marks <0){
                throw new Exception("min should be zero ");
            }
            if(marks >100){
                throw new Exception("max should be 100 ");
            }
            Student s = new Student(rno, name, marks);
            s.show();
        }catch(NumberFormatException e){
            System.out.println("integers only");

        }catch(Exception e){
            System.out.println("issue = " + e.getMessage());
        }

    }
    
}
