//import lib 
import java.sql.*;
import java.io.*;

class P3{
    public static void main(String[] args){
        Console c = System.console();

        try{
            //load the driver 
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            //get connection
            String url = "jdbc:mysql://localhost:3306/tcs_10june23";
            String username = "root";
            String password = "Ver@1812";
            Connection con = DriverManager.getConnection(url, username, password);

            //create record 
            int eid = Integer.parseInt(c.readLine("Enter emp id : "));
            String name = c.readLine("Enter name : ");
            String sql = "insert into emp values(?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,eid);
            pst.setString(2,name);
            pst.executeUpdate();
            System.out.println("Record created ");

            //close connection
            con.close();
        }catch (SQLException e) {
            System.out.println("Issue : " + e);
        }

    }
}
