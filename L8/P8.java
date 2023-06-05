//lamda 
interface A{
    void m();
}
class P8 {
    public static void main(String[] args) {

        A a = () -> {System.out.println("hello");};
        a.m();
    }

    
}
