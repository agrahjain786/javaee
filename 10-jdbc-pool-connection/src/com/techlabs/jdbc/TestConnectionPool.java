package com.techlabs.jdbc;

import java.io.IOException;
import java.sql.Connection;
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


@WebServlet("/TestConnectionPool")
public class TestConnectionPool extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name = "jdbc/organisation")
	private DataSource dataSource;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			
			Connection connection = dataSource.getConnection();
			
			Statement stmt = connection.createStatement();
			
			String query = "select * from employee";
			
			ResultSet rs = stmt.executeQuery(query);
			
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
