<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

	<form action="addStudent">
		<input type="text" name="name"> 
		<br> 
		<input type="number" name="id"> 
		<br> 
		<input type="text" name="tech">
		<br>
		<button type="submit">Submit</button>
	</form>
	<form action="getStudent">
		<input type="text" name="id"> 
		<button type="submit">Submit</button>
	</form>

</body>
</html>