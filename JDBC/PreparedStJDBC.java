package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStJDBC {

	public static void main(String[] args) {
		String url = "jdbc:mysql://192.168.10.150:3306/dac4";
		String user = "dac4";
		String pwd = "welcome";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,user,pwd);
			String query = "INSERT INTO newstudent(studentID,namefirst,namelast) VALUES (?,?,?)";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, 9);
			pst.setString(2, "Ashish");
			pst.setString(3, "Singh");
			
			int res = pst.executeUpdate();
			if(res!=0) {
				System.out.println("Succesfully inserted");
			}else {
				System.out.println("Unsuccessfull Operaion");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
