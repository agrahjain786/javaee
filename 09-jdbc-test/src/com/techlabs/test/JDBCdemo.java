package com.techlabs.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/JDBCdemo")
public class JDBCdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/organisation","root","Agrah@786");
			
			Statement stmt = connection.createStatement();
			
//			String insertQuery = "insert into employee values (8086,'AGRAH','JAIN',7782,'1999-12-12',2000,100,30);";
//			
//			int res = stmt.executeUpdate(insertQuery);
//			
//			System.out.println("Number of rows affected "+ res);
			
//			String insertQuery = "update employee set job = 'MANAGER' where emp_no = '8086';";
//			
//			int res = stmt.executeUpdate(insertQuery);
//			
//			System.out.println("Number of rows affected "+ res);
			
			String insertQuery = "delete from employee where emp_no = '8086';";
			
			int res = stmt.executeUpdate(insertQuery);
			
			System.out.println("Number of rows affected "+ res);
			
			String query = "select * from employee";
			
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt("emp_no")+" "+ rs.getString("emp_name") +" "+ rs.getString("job") +" "+ rs.getInt("mgr") +" "+ rs.getString("hire_date") +" "+ rs.getInt("salary") +" "+ rs.getInt("comm") +" "+ rs.getInt("department_no"));
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
