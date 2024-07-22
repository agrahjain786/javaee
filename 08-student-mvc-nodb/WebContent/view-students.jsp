<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border = 3>
	
		<tr>
			 <td> Student id </td>
			 <td> First Name </td>
			 <td> Last Name</td>
			 <td> Email</td>
		</tr>
	
	
		<c:forEach var="student" items="${studentList}">
			<tr>
				 <td> ${student.id} </td>
				 <td> ${student.firstName}</td>
				 <td> ${student.lastName} </td>
				 <td> ${student.email} </td>
			</tr>
		
		
		</c:forEach>
	
	</table>


</body>
</html>