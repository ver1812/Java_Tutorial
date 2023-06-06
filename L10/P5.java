import java.io.*;
import java.util.*;
public class P5 {
    public static void main(String[] args) {
        Console c = System.console();
        ArrayList<Integer> stack = new ArrayList<Integer>();

        while(true) {
            int op = Integer.parseInt(c.readLine("1 push 2 pop 3 show 4 exit 5"));
            if (op ==1){
                int ele = Integer.parseInt(c.readLine("Enter element " ));
                stack.add(ele);
            }
            else if (op == 2) {
                if (stack.size() == 0) {
                    System.out.println("Stack is empty");
                }
                else {
                    System.out.println(stack.remove(stack.size() - 1));
                }
            }
            else if (op == 3) {
                if (stack.size() == 0) {
                    System.out.println("Stack is empty");
                }
                else {
                    System.out.println(stack);
                }
            }
            else if (op == 4) {
                break;
            }
            else{
                System.out.println("Invalid input");
            }
    
        }
    }
    
}
