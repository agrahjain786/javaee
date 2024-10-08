package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.techlabs.entity.Student;
import com.techlabs.util.StudentDBUtil;


@WebServlet("/student")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private StudentDBUtil studentdbUtil;
	
    @Resource(name = "jdbc/studentdb")
	private DataSource dataSource;

    
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		studentdbUtil = new StudentDBUtil(dataSource);
	}




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String command = request.getParameter("command");
	    if (command == null) {
	    	command = "list_student";
	    }
		System.out.println(command);
		switch(command){
		case "add_student":
			addStudent(request, response);
			break;
		default:
			listStudents(request,response);
		}
			
	}
	
	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String email = request.getParameter("email");
		
		Student student = new Student(firstName, lastName, email);
		
		boolean addedOrNot = studentdbUtil.addStudent(student);
		
		if(addedOrNot) System.out.println("Student added successfully");
		
//		listStudents(request,response);
		response.sendRedirect("student");
		
	}




	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		List<Student> students = studentdbUtil.getStudentData();
		System.out.println(students);
		
		request.setAttribute("studentList", students);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/list-students.jsp");
		
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
