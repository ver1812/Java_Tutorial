// program to maintain list of friends attending bday party
import java.io.*;
import java.util.*;
class P4{
    public static void main(String args[]){
        Console c = System.console();
        ArrayList<String> friends = new ArrayList<String>();
        while (true) {
            int op = Integer.parseInt(c.readLine("1 add 2 remove 3 see 4 exit "));
            if(op == 1){
                friends.add(c.readLine("Enter name: "));
            }
            else if(op == 2){
                
                friends.remove(c.readLine("Enter name: "));
            }
            else if(op == 3){
                System.out.println(friends);
            }
            else if(op == 4){
                break;
            }
            else{
                System.out.println("Invalid input");
            }
        }
    }
}
