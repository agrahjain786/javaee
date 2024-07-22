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
	
		String prefLanguage = "Java";
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null){
			for(Cookie c: cookies){
				if(c.getName().equals("preferredLanguage")){
					prefLanguage = c.getValue();
					break;
				}
			}
		}
	
	%>
	
	<h4>Your selected language is: <%=prefLanguage %></h4>
	
	<a href = "cookie-form.jsp"> Change selected Language</a>


</body>
</html>