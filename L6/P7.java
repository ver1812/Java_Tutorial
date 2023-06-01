import java.io.*;

class Student
{
    private int rno ;
    private String name;

    public Student(int rno, String name)
    {
        this.rno = rno;
        this.name = name;
    }

    public void show(){
        System.out.println("rno : " + rno);
        System.out.println("name : " + name);
    }


}

class P7 {
    public static void main(String[] args) {
        Console c = System.console();

        // read number of students 
        int n = Integer.parseInt(c.readLine("Enter number of students: "));
        //create array of students

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = c.readLine("Enter name: ");
            int rno = Integer.parseInt(c.readLine("Enter rno: "));
            students[i] = new Student(rno, name);
        }

        for (int i = 0; i < n; i++) {
            students[i].show();
        }


       


    }
    
}
