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

	<c:set var="name" value="Agrah"></c:set>
	<h2> my name is ${name} </h2>
	
	<c:if test="${name.length() >= 5}">
	
		<h2> name ${name } has greater than 5 letters</h2>		
	
	</c:if>
	
	<c:if test="${name.length() < 5}">
	
		<h2> name ${name } has less than 5 letters</h2>
	
	</c:if>
	
	<c:choose>
	
	
		<c:when test="${name.length() >= 5}">
		
			<h2>  Your name has equal to or more than 5 letters</h2>
		
		</c:when>
		<c:when test="${name.length() > 5}">
		
			<h2> Your name has between 3 to 5 letters</h2>
		
		</c:when>
		
		<c:otherwise>
		
			<h2> your name length is less than 3 </h2>
		
		</c:otherwise>
	
	</c:choose>
	
	<c:choose>
	
	
		<c:when test="${name.equals('Agrah') }">
		
			<h2> Your name is Agrah</h2>
		
		</c:when>
		
		<c:otherwise>
		
			<h2> Your name is not Agrah</h2>
		
		</c:otherwise>
	
	</c:choose>
	
	
	

</body>
</html>