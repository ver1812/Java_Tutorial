package App;
class App {
    public static void main(String[] args) {
        SplashFrame sf = new SplashFrame();
        try{
            Thread.sleep(5000);
            MainFrame mf = new MainFrame();
            sf.dispose();
        } catch(Exception e) {
            System.out.println(e);
        }

    }
    
}
