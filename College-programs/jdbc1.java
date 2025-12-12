import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class jdbc1 {
	public static void main(String args[]) throws Exception{
	
		Connection con = null;
		Class.forName("org.postgresql.Driver");
		
		try {
		con = DriverManager.getConnection("jdbc:postgresql://localhost/college", "postgres", "");
		
		
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
		if(con != null) {
		System.out.println("connection is successfull !");
		} else {
		System.out.println("connection is unsuccessfull !");
		}
		
		Statement st = con.createStatement();
		
		//, 'Alice', 'ali@gmail.com', 135790)");
		
		//insert records to studentdata table
		//update data from studentdata 
		int ans3 = st.executeUpdate("update  studentdata set name = 'Nikhil' where name= 'Bob' ");
		System.out.println("updated successfully !");
		
		//to delete data from studentdata file
		
		int ans2 = st.executeUpdate("delete from studentdata where id=4");
		System.out.println("deleted data successfull !");
		
		// int ans = st.executeUpdate("insert into studentdata values(5
		// System.out.println(ans + "student data inserted !");
		
		
		ResultSet rs = st.executeQuery("select * from studentdata");
		
		//show all data from studentdata table
		while(rs.next()) {
		
		int  id = rs.getInt("id");
		System.out.println(id);
		
		
		String name = rs.getString("name");
		System.out.println(name);
		
		String email = rs.getString("email");
		System.out.println(email);
		
		int mbno = rs.getInt("mbno");
		System.out.println(mbno);
		}
		
		
		
}
}
