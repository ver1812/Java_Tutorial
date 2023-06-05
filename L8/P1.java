//concrete class : Both methods have body
class Parent{

    public void mb(){
        System.out.println("Parent will pay ");
    }
    public void eb(){
        System.out.println("Parent will pay ");
    }

}
class Child extends Parent{

}
class P1{
    public static void main(String[] args){

        Child c = new Child();
        c.mb();
        c.eb();
        
    }
}