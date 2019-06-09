<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h3>Home Page</h3>
	<div class="container">
		<h1>Donuts</h1>
		<c:forEach items="${names}" var="n">
			<ul>
				<li><a href="details?id=${n.id}">${n.name}</a></li>
			</ul>
		</c:forEach>
	</div>

</body>
</html>