<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${donut.name} Donut</title>
</head>
<body>
	<a href="/">Back to List</a>
	<h1>Donut</h1>
	
	<h4>Name: ${donut.name}</h4>
	<h4>Calories: ${donut.calories}</h4>
	
	<c:if test = "${extrasLength > 0}">
		<h4>Extras:</h4>
		<ul>
			<c:forEach var="extra" items="${donut.extras}">
				<li>${extra}</li>
			</c:forEach>
		</ul>
	</c:if>
	
</body>
</html>