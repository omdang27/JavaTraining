package JDBC;
import java.sql.*;
public class SelectionDemo {

	public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:///demo","root","root");
		Statement st = con.createStatement();
		String query= "select * from vasu";
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+rs.getString("name"));
		}
				
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	

	}

}
