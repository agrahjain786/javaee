package com.techlabs.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;



@WebServlet("/JDBCPreparedStatement")
public class JDBCPreparedStatement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@Resource(name = "jdbc/organisation")
	private DataSource dataSource;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			
			Connection connection = dataSource.getConnection();
			
//			PreparedStatement stmt = connection.prepareStatement("insert into employee values (? , ? , ? , ? , ? , ? , ? , ?)");
//			
//			stmt.setInt(1, 8086);
//			stmt.setString(2, "Agrah");
//			stmt.setString(3, "Manager");
//			stmt.setInt(4, 7782);
//			Date hireDate = Date.valueOf("1999-12-12");
//			stmt.setDate(5, hireDate);
//			stmt.setInt(6, 3000);
//			stmt.setInt(7, 100);
//			stmt.setInt(8, 30);
			
			PreparedStatement stmt = connection.prepareStatement("delete from employee where emp_no = ?;");
			
			stmt.setInt(1, 8086);
			
			int res = stmt.executeUpdate();
			
			System.out.println("Number of rows affected "+ res);
			
			
			String query = "select * from employee";
			
			stmt = connection.prepareStatement("select * from employee where salary >= ?;");
			
			stmt.setInt(1, 3000);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("emp_name"));
			}
			
			rs.close();
			stmt.close();
			connection.close();
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
