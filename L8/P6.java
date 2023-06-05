abstract class Mu{
    public void fe(){
        System.out.println("mu checks ");
    }
    public abstract void se();
    public abstract void te() ;
    public void be() {
        System.out.println("mu checks ");
    }

}
class Coll extends Mu{
    public void se(){
        System.out.println("college checks ");

    }
    public void te() {
        System.out.println("college checks ");

    }

}


class P6 {
    public static void main(String[] args) {
        Coll mu1 = new Coll();
        mu1.fe();
        mu1.se();
        mu1.te();
        mu1.be();
     
    }
    
}

