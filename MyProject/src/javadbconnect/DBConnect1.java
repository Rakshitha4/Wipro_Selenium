package javadbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class DBConnect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/wiprodb"; // DB URL
		String username = "root";
		String password = "root";
		Connection conn=null;
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver"); // Load driver
			 conn = DriverManager.getConnection(url, username, password);
			 
			 String sql="Insert into users(usename,password) values(?,?)";
			 CallableStatement cs =  (CallableStatement) conn.prepareCall(sql);
//			 CallableStatement cs =  conn.prepareCall(sql); this is correct by i was getting error so i casted (CallableStatement)
			 cs.setString(1,"John");
			 cs.setString(2, "1678");
			 cs.execute();
			 System.out.println("Record Inserted Successfully!!");
					 
		 } catch (ClassNotFoundException e) {
			 e.printStackTrace();
		 }//Load Driver
		catch (SQLException e) {	 
			 e.printStackTrace();
		 }

	}

}
