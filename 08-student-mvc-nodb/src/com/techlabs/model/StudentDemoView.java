package com.techlabs.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentDemoView")
public class StudentDemoView extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");
        out.println("<table border = 9");
        out.println("<tr><td> Student id </td><td> First Name </td><td> Last Name</td><td> Email</td></tr>");
        
        List<Student> students = (List<Student>) request.getAttribute("studentList");
        
        for(Student student: students) {
        	out.println("<tr><td>" + student.getId() + "</td><td>" + student.getFirstName() + "</td><td>" + student.getLastName() + "</td><td>" + student.getEmail() + "</td></tr>");
        }
        
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
