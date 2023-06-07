import java.io.*;
import java.util.*;

class Student{
    private String name ;
    private int marks ;

    public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

    public String toString(){
        return name + " " + marks;
    }
}


class P8 {
    public static void main(String[] args) {
        Console c = System.console();
        TreeMap<Integer,Student> data = new TreeMap<>();

        while(true){
            int op = Integer.parseInt(c.readLine("1 add new , 2 view , 3 delete , 4 exit "));
            if(op==1){
                int rno = Integer.parseInt(c.readLine("Enter rno : ")); 
                if(data.get(rno) !=null){
                    System.out.println(rno + " already exists ");
                }
                else{
                    String name = c.readLine("Enter name : ");
                    int marks = Integer.parseInt(c.readLine("Enter marks : "));
                    data.put(rno,new Student(name,marks));
                    System.out.println("added " + rno);
                }


            }
            else if(op==2){
                System.out.println(data);

            }
            else if(op==3){
                int rno = Integer.parseInt(c.readLine("Enter rno : "));
                if(data.get(rno)!=null){
                    data.remove(rno);
                    System.out.println("deleted " + rno);
                }
                else{
                    System.out.println(rno + " does not exist ");
                }
            }
            else if(op==4){
                break;
            }
            else{
                System.out.println("invalid option");
            }
        }

    }
    
}
