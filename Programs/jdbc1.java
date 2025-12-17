package Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc1 {
    public static void main(String args[]) throws Exception {

    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = null;
    try {

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "NewStrongPassword");

    } catch(SQLException e) {
        e.printStackTrace();
    }
    if(con != null) {
        System.out.println("connection is successful:");
    } else {
        System.out.println("connection unsuccessfull");
    }
    }
}