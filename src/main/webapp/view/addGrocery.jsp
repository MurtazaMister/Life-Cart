<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="/setGroceries" modelAttribute="Grocery">
		Name : <form:input path="name" type="text" name="name" />
		Cost Price : <form:input path="costPrice" type="text" name="costPrice" />
		Sell Price : <form:input path="sellPrice" type="text" name="sellPrice" />
		Quantity : <form:input path="quantity" type="text" name="quantity" />
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>