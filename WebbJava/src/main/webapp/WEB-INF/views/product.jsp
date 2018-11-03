<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<body>
<h2>Product for view</h2>
<!--<div>product name: ${product.id}</div>
<div>product name: ${product.name}</div>
<div>product name: ${product.info}</div>
<div>product name: ${product.price}</div> -->


<table>
<tr>
<td width='400'>${product.name}</td>
<td width ='400'></td>
</tr>
<tr>
<td width='400'><img width='300' height='300' src='./images/${product.id}.jpg'/></td>
<td width ='400'>${product.info}</td>
</tr>
<tr>
<td width='400'>${product.price}</td>
<td width ='400'><input type='button' value='BUY'/></td>
</tr>
</table>
</body>
</html>
