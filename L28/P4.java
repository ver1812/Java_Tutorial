//implement tree
import java.io.*;

class Node{
    protected int data;
    protected Node left;
    protected Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Tree {
    void add(Node n,int ele){
        if(ele < n.data){
            if(n.left == null){
                n.left = new Node(ele);
                System.out.println("Added " + ele + " to tree");
            }else{
                add(n.left,ele);
            }
        
        }else if(ele > n.data){
            if(n.right == null){
                n.right = new Node(ele);
                System.out.println("Added " + ele + " to tree");
            }else{
                add(n.right,ele);
            }
        }
    }
    void show(Node n){
        if(n != null){
            show(n.left);
            System.out.print(n.data + " ");
            show(n.right);
        }
    }
}

class P4 {
    public static void main(String[] args) {
        Console c = System.console();
        Tree t = new Tree();
        Node root = new Node(10);
        
        while (true)
        {
            int op = Integer.parseInt(c.readLine("1. Add\n2. Show\n3. Exit\nEnter your choice: "));
            switch(op){
                case 1:
                    int item = Integer.parseInt(c.readLine("Enter item to add: "));
                    t.add(root,item);
                    break;
                case 2:
                    t.show(root);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
}
