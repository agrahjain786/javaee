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

<%

String[] degrees = {"BE", "BTech", "BCom"};
pageContext.setAttribute("thedegrees", degrees);

/* for(String degree : degrees){
	out.println("<p>"+ degree +"</p>");
} */

%>

<c:forEach var="degree" items="${thedegrees}">
${degree}
</c:forEach>

</body>
</html>