//object oriented programming 
// class Student
// var rno , name , marks
// setData(),showData()

class Student{
    int rno;
    String name;
    int marks;

    void setData(int r , String n , int m) {
        rno = r;
        name = n;
        marks = m;

    }

    void showData() {
            System.out.println("rno : " + rno);
            System.out.println("name : " + name);
            System.out.println("marks : " + marks);
        }

}

class P6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData(101, "Raj", 90);
        s1.showData();

        Student s2 = new Student();
        s2.setData(10, "RajESH", 80);
        s2.showData();

    }
    
}
