<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detail Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
	<h3><a href="/" class="btn btn-primary">Back to List</a></h3>
		<h1>Donut Details</h1>
			<p><strong>Name:</strong> ${donutInfo.name} <p>
			<p><strong>Calories:</strong> ${donutInfo.calories}<p>
			
			<p><strong>Extra:</strong></p>
				<c:forEach items="${extra}" var="e">
					<ul>
						<li><c:out value="${e}"/></li>
					</ul>
				</c:forEach>
	</div>
</body>
</html>