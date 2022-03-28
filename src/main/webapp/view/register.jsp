<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="/saveUser" modelAttribute="User">
		Username : <form:input path="username" type="text" name="username" />
		Email : <form:input path="email" type="email" name="email" />
		Password : <form:password path="password" name="password" />
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>