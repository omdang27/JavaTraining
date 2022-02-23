package JDBC;
import java.sql.*;
public class Queries {

	public static void main(String[] args) throws ClassNotFoundException {
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection	con = DriverManager.getConnection("jdbc:mysql:///demo","root","root");
	    Statement st = con.createStatement();
	    String sql="select * from vasu "
	    		+ " where id=103  ";
	    ResultSet s=st.executeQuery(sql);
	    
	    while(s.next())
	    {
	    	System.out.println(s.getInt("id")+s.getString("name"));
	    }
	    
	
	
	
	
	
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	

	}

}
