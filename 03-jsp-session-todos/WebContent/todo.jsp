<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.ArrayList"%>
   
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

	<h1 class="text-center"> Todo List:</h1>

	<form action = "#" method="get">

		<div class="mb-3 mt-5">
  
    		<input type="text" class="form-control mb-3" id="item" name = "item" placeholder = "Add an item">
    
    		<button type="submit" class="btn btn-primary">Submit</button>
    
    
		</div>

	</form>

	<hr>

	<%
	
	List<String> todoItemList = (ArrayList<String>) session.getAttribute("todoItem");
	
	if (todoItemList == null) {
	    todoItemList = new ArrayList<>();
	    session.setAttribute("todoItem", todoItemList);
	}
	
	String addedItem = request.getParameter("item");
	if(addedItem != null && !addedItem.trim().equals("")){
		todoItemList.add(addedItem);
		out.println("<h2 class ='lead'> Item Added </h2");
	}
	out.println("<ul class=\"list-group\">");
    for (String s : todoItemList) {
        out.println("<li class=\"list-group-item\">" + s + "</li>");
    }
    out.println("</ul>");
	
	%>


</div>

</body>
</html>