package javadbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {
		 String url = "jdbc:mysql://localhost:3306/wiprodb"; // DB URL
		 String username = "root";
		 String password = "root";
		 Connection conn=null;
		 
		 
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver"); // Load driver
			 conn = DriverManager.getConnection(url, username, password);
			 System.out.println("Connected to DB!");
//			 conn.close();
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
		 
		 try {
			 String sql="INSERT INTO users(usename,password) VALUES(?,?)";
			 PreparedStatement stmt = conn.prepareStatement(sql);
			 stmt.setString(1, "Clara");
			 stmt.setString(2, "1456");
			 stmt.executeUpdate();
			 System.out.println("Record Inserted Successfully!!");
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
		 
		 try {
			 String sql="SELECT * FROM USERS";
			 PreparedStatement stmt=conn.prepareStatement(sql);
			 ResultSet rs=stmt.executeQuery();
			 while(rs.next()) {
				 int id=rs.getInt("id");
				 String usename=rs.getString("usename");
				 String password1=rs.getString("password");
				 System.out.println(id+" "+usename+" "+password1);
			 }
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
		 
		 try {
			 String sql="UPDATE users SET usename=?,password=? WHERE id=?";
			 PreparedStatement stmt=conn.prepareStatement(sql);
			 stmt.setString(1, "daniel");
			 stmt.setString(2, "8654");
			 stmt.setInt(3, 6);
			 System.out.println("Record Updated Successfully!!!");
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
		 
		 try {
			 String sql="DELETE from users where id=?";
			 PreparedStatement stmt=conn.prepareStatement(sql);
			 stmt.setInt(1, 4);
			 stmt.executeUpdate();
			 System.out.println("Record Deleted Successfully!!");
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }

	}
}
