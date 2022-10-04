<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>

		<h1>Student Name Is ${student.name }</h1>
		<h1>Student Id Is ${student.id }</h1>
		<h1>Student Email Id Is ${student.emailid }</h1>
		<h1>Student Courses Is ${student.courses }</h1>
		<h1>Student Gender Is ${student.gender }</h1>
		<h1>Student Type Is ${student.type}</h1>
		<hr>
		<h1>Student Address City Is ${student.address.city }</h1>
		<h1>Student Address Street Is ${student.address.street }</h1>

	</center>
</body>
</html>