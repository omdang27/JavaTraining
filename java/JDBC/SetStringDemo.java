package JDBC;
import java.sql.*;
public class SetStringDemo {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///demo","root","root");
			
			String sql="insert into vasu(id,name) values(?,?)";
			PreparedStatement statement=con.prepareStatement(sql);

            statement.setLong(1, 105);
            statement.setString(2,"anuj");
            
       
			
			
			int row=statement.executeUpdate();
			if(row>0) {
				System.out.println("a row has been inserted");
			}
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}
