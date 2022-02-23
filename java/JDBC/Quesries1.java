package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Quesries1 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection	con = DriverManager.getConnection("jdbc:mysql:///demo","root","root");
		    Statement st = con.createStatement();
		    String sql="select * from vasu "
		    		+ " where name like 'v%'  ";
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
