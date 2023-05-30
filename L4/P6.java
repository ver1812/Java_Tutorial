import java.io.* ;
class P6 {
    public static void main(String[] args) {
        Console c = System.console();
        String Username = new String(c.readLine("Enter Username : "));
        
        String Password = new String(c.readPassword("Enter Password : "));
        

        //check if username matches "vighnesh" and password matches "1234V"

        if (Username.equals("vighnesh")&& Password.equals("1234v")) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }
    }

    
}
