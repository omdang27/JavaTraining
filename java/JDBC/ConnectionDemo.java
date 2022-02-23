package JDBC;
import java.sql.*;
public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql:///demo","root","root");
	Statement st=con.createStatement();
	String query="create table vasu1(id int,name varchar(15))";
	st.executeUpdate(query);
    System.out.println("Table created Successfully");	

	}
		catch(Exception e)
		{
			System.out.println("Error!!");
		}

}
}