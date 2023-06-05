//interface
interface Parent{

    public abstract void mb();
    public abstract void eb();

}
class Child implements Parent{
    public void eb(){
        System.out.println("Child will pay ");
    }
    public void mb(){
        System.out.println("Child will pay ");
    }

}
class P4{
    public static void main(String[] args){

        Child c = new Child();
        c.mb();
        c.eb();
        
    }
}