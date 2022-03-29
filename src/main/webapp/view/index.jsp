<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<ul>
			<li><a href="/">Home</a></li>
			<li><a href="/login">Login</a></li>
			<li><a href="/logout">Logout</a></li>
			<c:if test = "${username ne null}">
			<li><a href="/groceries">Buy groceries</a></li>
			</c:if>
		</ul>
	</nav>
	<div>
		${username}
		<c:if test = "${username eq null}">
			Not logged in
		</c:if>
	</div>
</body>
</html>