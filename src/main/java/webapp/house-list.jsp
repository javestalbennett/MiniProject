<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results Page</title>
</head>
<body>
<form method = "post" action = "navigationServlet" >
<table>
<c:forEach items="${requestScope.allItems}" var="currentitem">
<tr>
<td><input type="radio" name="id" value="${currentitem.id}"></td>
<td>${currentitem.address}</td>
<td>${currentitem.city}</td>
<td>${currentitem.price}</td>
<td>${currentitem.numRooms}</td>
<td>${currentitem.numBaths}</td>
<td>${currentitem.a_c}</td>
<td>${currentitem.basement}</td>
<td>${currentitem.pool}</td>
<td>${currentitem.stories}</td>
</tr>
</c:forEach>
</table>
<input type = "submit" value = "edit" name="doThisToItem" class="btn btn-warning">
<input type = "submit" value = "delete" name="doThisToItem" class="btn btn-danger">
<input type="submit" value = "add" name = "doThisToItem" class="btn btn-success">

</form>
</body>
</html>