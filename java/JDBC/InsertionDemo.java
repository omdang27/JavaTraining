package JDBC;
import java.sql.*;
public class InsertionDemo {

	public static void main(String[] args) throws ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	try {
		Connection con=DriverManager.getConnection("jdbc:mysql:///demo","root","root");
		Statement st= con.createStatement();
		String query="insert into vasu(id,name) values(102,'anuj')";
		int i=st.executeUpdate(query);
		
		if(i>0)
		{
			System.out.println("record added successfully");
		}
		else
		{
			System.out.println("errror!");
		}
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	

	}

}
