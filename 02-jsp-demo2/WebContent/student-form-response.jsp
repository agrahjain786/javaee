<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<div class = "container mt-5">
<h1 class="text-center"> User  Details:</h1>
<hr>

<p class="lead"> First Name: <%= request.getParameter("first_name") %></p>
<p class="lead"> Last Name: <%= request.getParameter("last_name") %></p>
<p class="lead"> City: <%= request.getParameter("city") %></p>
<p class="lead"> Gender: <%= request.getParameter("gender") %></p>
 <p class="lead"> Languages Known: 
	<%
        String[] languages = request.getParameterValues("languages");
        if (languages != null) {
            String languageString = String.join(", ", languages);
            out.println(languageString);
        } else {
            out.println("No languages selected");
        }
    %>
</p>

</div>

</body>
</html>