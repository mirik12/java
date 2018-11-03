<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<body>
	<h2>Product for view</h2>
<form action='' method='post'><input type='hidden' name='category' value='1'/><input type='submit'/></form>
<form action='' method='post'><input type='hidden' name='category' value='2'/><input type='submit'/></form>
<form action='' method='post'><input type='hidden' name='category' value='3'/><input type='submit'/></form>
	<element>
	cart: ${sessionScope.cart.listLength}
	</element>
	
	<c:forEach var="product" items="${products}">
		<table>
			<tr>
				<td width='400'>${product.name}</td>
				<td width='400'></td>
			</tr>
			<tr>
				<td width='400'><img width='300' height='300'
					src='./images/${product.id}.jpg' /></td>
				<td width='400'>${product.info}...<a href='?id=${product.id}'>more info</a></td>
			</tr>
			<tr>
				<td width='400'>${product.price}</td>
				<td width='400'><input type='button' value='BUY' /></td>
			</tr>
		</table>
	</c:forEach>


</body>
</html>
