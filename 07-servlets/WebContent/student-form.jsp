<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student form</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
<div class="container">
<form action = "hello" method="post">

<h1 class="text-center"> User Registration:</h1>
<hr>

  <div class="mb-3">
  
    <label for="first_name" class="form-label">First Name</label>
    <input type="text" class="form-control" id="first_name" name = "first_name">
    
    
  </div>
  <div class="mb-3">
  
    <label for="last_name" class="form-label">Last Name</label>
    <input type="text" class="form-control" id="last_name" name = "last_name">
    
  </div>
  
  
  <div class ="mb-3">
  
  <label for="city" class="form-label">City</label>
  <select class="form-select" id ="city" name="city"aria-label="Default select example" >
  <option value="Mumbai">Mumbai</option>
  <option value="Pune">Pune</option>
  <option value="Delhi">Delhi</option>
  
  </select>
  
  </div>
  
  <div class ="mb-3">
  <label for="gender" class="form-label">Gender</label>
  <div class="form-check">
	  <input class="form-check-input" type="radio" name="gender" id="gender-male" value ="male">
	  <label class="form-check-label" for="gender-male">
	    Male
	  </label>
	</div>
	<div class="form-check">
	  <input class="form-check-input" type="radio" name="gender" id="gender-female" value ="female">
	  <label class="form-check-label" for="gender-female">
	    Female
	  </label>
	</div>
	  
  </div>
  
  <div class ="mb-3">
  <label for="languages" class="form-label">Languages:</label>
  
  <div class="form-check">
	  <input class="form-check-input" type="checkbox" name="languages" value="English" id="language-english">
	  <label class="form-check-label" for="language-english">
	    English
	  </label>
	</div>
	<div class="form-check">
	  <input class="form-check-input" type="checkbox" name="languages" value="Hindi" id="language-hindi">
	  <label class="form-check-label" for="language-hindi">
	    Hindi
	  </label>
	</div>
	<div class="form-check">
	  <input class="form-check-input" type="checkbox" name="languages" value="Tamil" id="language-tamil">
	  <label class="form-check-label" for="language-tamil">
	    Tamil
	  </label>
	</div>
	<div class="form-check">
	  <input class="form-check-input" type="checkbox" name="languages" value="Kannada" id="language-kannada">
	  <label class="form-check-label" for="language-kannada">
	    Kannada
	  </label>
	</div>
	  
  </div>
  
  
  <button type="submit" class="btn btn-primary">Submit</button>

</form>
</div>
</body>
</html>