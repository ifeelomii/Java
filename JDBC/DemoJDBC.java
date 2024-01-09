package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://192.168.10.150:3306/dac4";
		String user = "dac4";
		String password = "welcome";
//		Class.forName("com.mysql.jdbc.Driver");
//		com.mysql.jdbc.Driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con = DriverManager.getConnection(url,user,password);
		String query = "select * from newstudent";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
			int id = rs.getInt("studentID");
			String fname = rs.getString(2);
			System.out.println("ID:"+id+" Name:"+fname);
		}
		con.close();	
	}

}
