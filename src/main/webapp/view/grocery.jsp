<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
	<div>
		<b>ID</b>
		<b>Name</b>
		<b>Price</b>
		<b>Quantity</b>
		<b>Required</b>
		<b>Add to cart</b>
	</div>
		<c:forEach items="${groceries}" var="grocery">
	        <div>
	        <form:form method="post" action="addToCart" modelAttribute="Cart">
		            <span><form:input path="prodID" type="text" name="prodID" value="${grocery.id}" readonly="true"/></span>
		            <span>${grocery.name}</span>
		            <span>${grocery.sellPrice}</span>
		            <span>${grocery.quantity}</span>
		            <span><form:input path="quantity" type="text" name="quantity"/></span>
		            <span><input type="submit" value="Add to cart" /></span>
            </form:form>
	        </div>
	    </c:forEach>
    </div>
    <div>
    	<h1>Cart</h1>
    	<div>
    		<span>Product-ID</span>
    		<span>Quantity</span>
    	</div>
    	<!-- Add delete from cart feature -->
    	<c:forEach items="${cart}" var="item">
    	<div>
    		<span>${item[0]}</span>
    		<span>${item[2]}</span>
    	</div>
    	</c:forEach>
    </div>
    <div>
    	<form method="post" action="checkout">
    		<input type="submit" value="Place order">
    	</form>
    </div>
    <c:if test = "${username ne null and isAdmin eq true}">
			Admin rights : <a href="addGroceries">Add Groceries</a>
	</c:if>
</body>
</html>