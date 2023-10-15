<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
<link rel="stylesheet" href="javestalbennett_css.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>


<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<a class="navbar-brand" href="index.html">House Mini-Project</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarText" aria-controls="navbarText"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarText">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link"
				href="index.html">Home <span class="sr-only">(current)</span></a>
			</li>
			<li class="nav-item"><a class="nav-link"
				href="house-list.jsp">House-List</a></li>
			<li class="nav-item"><a class="nav-link"
				href="edit-item.jsp">Edit-Item</a></li>
		</ul>
	</div>
</nav>
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
