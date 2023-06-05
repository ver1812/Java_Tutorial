//abstract class
abstract class Parent{

    public abstract void mb();
    public abstract void eb();

}
class Child extends Parent{
    public void eb(){
        System.out.println("Child will pay ");
    }
    public void mb(){
        System.out.println("Child will pay ");
    }

}
class P3{
    public static void main(String[] args){

        Child c = new Child();
        c.mb();
        c.eb();
        
    }
}