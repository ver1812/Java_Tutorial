import java.io.Console;

class Student{
    private int rno;
    private String name ;
    private Double marks;
    private static String cn = "Terna Engineering College";

    public Student(int rno, String name, Double marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    public void showStudent(){
        System.out.println("rno :  " + rno);
        System.out.println("name : " + name);
        System.out.println("marks : " + marks);
        System.out.println("College Name : " + cn);
        System.out.println();
    }
    public void findGrade(){
        
        if (marks > 80) System.out.println("Grade A");
        else if (marks > 60) System.out.println("Grade B");
        else System.out.println("Grade C");
    }

}

class P3 {
    public static void main(String[] args) {
        Console c = System.console();
        // Get size of student array
        int size = Integer.parseInt(c.readLine("ENter size of student array "));
        //create array 
        Student[] studentArray = new Student[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter student details ");
            int rno = Integer.parseInt(c.readLine("Enter rno : "));
            String name = c.readLine("Enter name : ");
            Double marks = Double.parseDouble(c.readLine("Enter marks : "));
            studentArray[i] = new Student(rno, name, marks);
        }
        //display array
        for (int i = 0; i < size; i++) {
            studentArray[i].showStudent();
            studentArray[i].findGrade();
        }
        
    }
    
}

