<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
		String selectedLanguage = request.getParameter("language");
		
		Cookie cookie = new Cookie("preferredLanguage", selectedLanguage);
		
		cookie.setMaxAge(60*10);
		
		response.addCookie(cookie);
	
	%>
	
	Cookie is Saved. Check the page to see <br>
	
	<a href = "cookie-home.jsp"> check cookie page</a>

</body>
</html>