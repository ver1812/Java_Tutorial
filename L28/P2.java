//implement queue using arraylist

import java.util.*;
import java.io.*;

class Queue{
    private ArrayList<Integer> data = new ArrayList<Integer>();

    public void enqueue(int item){
        data.add(item);
        System.out.println(item + " enqueued to queue");
    }
    public void dequeue(){
        if(data.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(data.get(0) + " dequeued from queue");
        data.remove(0);
    }
    public void show(){
        System.out.println("Queue: " + data);
    }

}

class P2 {
    public static void main(String[] args) {
        Console c = System.console();
        Queue q = new Queue();

        while(true)
        {
            int op = Integer.parseInt(c.readLine("1. Enqueue\n2. Dequeue\n3. Show\n4. Exit\nEnter your choice: "));
            switch(op){
                case 1:
                    int item = Integer.parseInt(c.readLine("Enter item to enqueue: "));
                    q.enqueue(item);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.show();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
}
