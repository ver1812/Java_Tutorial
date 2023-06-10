//import lib 
import java.sql.*;
import java.io.*;

class P4{
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

            //view record 
            
            String sql = "select * from emp";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
                System.out.println("id: " + rs.getInt(1) + "name : " + rs.getString(2));

            //close connection
            con.close();
        }catch (SQLException e) {
            System.out.println("Issue : " + e);
        }

    }
}
