import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


class jdbc2 {
    public static void main(String args[]) throws Exception{

        Connection con = null;
		Class.forName("org.postgresql.Driver");

        try {

		con = DriverManager.getConnection("jdbc:postgresql://localhost/college", "postgres", "");

        }catch(SQLException e) {
            e.printStackTrace();
        }

        if(con != null) {
            System.out.println("database is connected !!");
        } else {
            System.out.println("Database is not connected !!");
        }

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from studentdata");
        while(rs.next()) {
            int  id = rs.getInt("id");

        }

        
            con.close();
    }
}