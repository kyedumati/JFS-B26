package com.jfs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstDAO {
	
	public boolean validateUser(String username, String password) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		boolean isValid=false;
		
		if("gopig".equalsIgnoreCase(username) && "Kasi@123".equals(password)) {
			isValid=true;
		}
		/*
		 * try { //Register the jdbc driver //For Mysql
		 * Class.forName("com.mysql.cj.jdbc.Driver");
		 * 
		 * //mysql database conn=
		 * DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jfs_21","root",
		 * "root");//url,username,password //Connection conn=
		 * DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system",
		 * "Admin@123");//url,username,password for oracle if(conn!=null) { stmt=
		 * conn.createStatement();
		 * 
		 * String query="select * from tbl_login_master where user_name='"
		 * +username+"' and password='"+password+"'"; if(stmt!=null) { rs =
		 * stmt.executeQuery(query);
		 * 
		 * while(rs.next()) { //
		 * System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		 * //using index //
		 * System.out.println(rs.getInt("empno")+" "+rs.getString("sal")+" "+rs.
		 * getString("job")); //using columnname isValid =true; } } }
		 * 
		 * } catch (ClassNotFoundException | SQLException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }finally { try { conn.close(); stmt.close();
		 * rs.close(); } catch (SQLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */
		return isValid;
	}

}
