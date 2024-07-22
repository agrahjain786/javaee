<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%@ page import = "com.techlabs.model.*, java.util.*" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1, "Agrah", 10000));
		employees.add(new Employee(2, "Abhi", 15000));
		employees.add(new Employee(3, "Jain", 20000));
		
		pageContext.setAttribute("allEmployees", employees);
	
	
	%>
	
	<table border = 3>
	
		<tr>
			 <td> Employee ID </td>
			 <td> Employee Name </td>
			 <td> Employee Salary </td>
			 <td> Salary Type</td>
		</tr>
	
	
		<c:forEach var="employee" items="${allEmployees}">
			<tr>
				 <td> ${employee.employeeId} </td>
				 <td> ${employee.name}</td>
				 <td> ${employee.salary} </td>
				 <td> <c:if test="${employee.salary >= 20000}">
	
						High	
					
					  </c:if>
					  
					  <c:if test="${employee.salary < 20000}">
	
						Low		
					
					  </c:if>
				</td>
			</tr>
		
		
		</c:forEach>
	
	</table>

</body>
</html>