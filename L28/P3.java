//implement single linked list
import java.io.*;

class Node{
    protected int data;
    protected Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class SingleLinkedList {
    protected Node head = null;

    public void add(int ele){
        if(head == null){
            head = new Node(ele);
            System.out.println("Added " + ele + " to list");
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(ele);
            System.out.println("Added " + ele + " to list");
        }
    }
    public void show(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}

class P3 {
    public static void main(String[] args) {
        Console c = System.console();
        SingleLinkedList sll = new SingleLinkedList();

        while(true)
        {
            int op = Integer.parseInt(c.readLine("1. Add\n2. Show\n3. Exit\nEnter your choice: "));
            switch(op){
                case 1:
                    int item = Integer.parseInt(c.readLine("Enter item to add: "));
                    sll.add(item);
                    break;
                case 2:
                    sll.show();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
}
