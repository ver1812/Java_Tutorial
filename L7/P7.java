//Overloading

class A{
    void compute(int a ,int b){
        int res = a+b ;
        System.out.println("res :"  + res);
    }
}
class B extends A{
    void compute(int a,int b,int c){
        int res = a + b + c ;
        System.out.println("res :"  + res);
    }
}

class P7 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.compute(10,20);
        b.compute(10,20,30);
    }
    
}
