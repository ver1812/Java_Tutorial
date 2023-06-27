//implement stack using arraylist
import java.util.*;
import java.io.*;
class Stack{
    private ArrayList<Integer> data = new ArrayList<Integer>();

    public void push(int item){
        data.add(item);
        System.out.println(item + " pushed to stack");
    }
    public void pop(){
        if(data.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(data.get(data.size()-1) + " popped from stack");
        data.remove(data.size()-1);
    }
    public void show(){
        System.out.println("Stack: " + data);
    }

}
class P1{
    public static void main(String[] args) {
        Console c = System.console();
        Stack s = new Stack();

        while(true)
        {
            int op = Integer.parseInt(c.readLine("1. Push\n2. Pop\n3. Show\n4. Exit\nEnter your choice: "));
            switch(op){
                case 1:
                    int item = Integer.parseInt(c.readLine("Enter item to push: "));
                    s.push(item);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.show();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
