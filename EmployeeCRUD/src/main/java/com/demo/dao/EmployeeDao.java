package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.demo.model.Employee;

public class EmployeeDao implements IEmployeeDao {

		private static String url = "jdbc:mysql://192.168.10.150:3306/dac4";
		private static String user = "dac4";
		private static String password = "welcome";
		private static List<Employee> empList;
	
		public List<Employee> DisplayEmp()
		{
			empList = new ArrayList<Employee>();
			try {
//				Class.forName("com.mysql.jdbc.Driver");
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				Connection con = DriverManager.getConnection(url,user,password);
				String query = "select * from employee";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String email = rs.getString("email");
					String phone = rs.getString("phone");
					System.out.println("ID:"+id+" Name:"+name);
					Employee emp = new Employee(id, name, email, phone);
					
					empList.add(emp);
				}
				con.close();
				return empList;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
	}
}
