interface Mu{
    public void fe();
    public abstract void se();
    public abstract void te() ;
    public void be() ;

}
class Coll implements Mu{
    public void se(){
        System.out.println("college checks ");

    }
    public void te() {
        System.out.println("college checks ");

    }
    public void be() {
        System.out.println("college checks ");

    }
    public void fe() {
        System.out.println("college checks ");

    }

}


class P7 {
    public static void main(String[] args) {
        Coll mu1 = new Coll();
        mu1.fe();
        mu1.se();
        mu1.te();
        mu1.be();
     
    }
    
}

