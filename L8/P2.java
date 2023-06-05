//abstract class 
abstract class Parent{

    public void mb(){
        System.out.println("Parent will pay ");
    }
    public abstract void eb();

}
class Child extends Parent{
    public void eb(){
        System.out.println("Child will pay ");
    }

}
class P2{
    public static void main(String[] args){

        Child c = new Child();
        c.mb();
        c.eb();
        
    }
}