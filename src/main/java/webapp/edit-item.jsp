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
				href="src/main/java/webapp/index.jsp">Home <span class="sr-only">(current)</span></a>
			</li>
			<li class="nav-item"><a class="nav-link"
				href="src/main/java/webapp/house-list.jsp">House-List</a></li>
			<li class="nav-item"><a class="nav-link"
				href="src/main/java/webapp/edit-item.jsp">Edit-Item</a></li>
		</ul>
	</div>
</nav>
<title>House List edit screen</title>
</head>
<body>
	<form action = "editItemServlet" method="post">
		Address: <input type = "text" name = "address" value= "${itemToEdit.address}">
		City: <input type ="text" name = "city" value= "${itemToEdit.city}">
		Price: <input type = "number" name = "price" value= "${itemToEdit.price}">
		Number of Rooms: <input type ="number" name = "numRooms" value= "${itemToEdit.numRooms}">
		Number of Bathrooms: <input type = "number" name = "numBaths" value= "${itemToEdit.numBaths}">
		Has A/C: <input type ="checkbox" name = "a_c" value= "${itemToEdit.a_c}">
		Has Basement: <input type ="checkbox" name = "basement" value= "${itemToEdit.basement}">
		Has Pool: <input type ="checkbox" name = "a_c" value= "${itemToEdit.pool}">
		# of Stories: <input type ="number" name = "stories" value= "${itemToEdit.stories}">
		<input type = "hidden" name = "id" value="${itemToEdit.id}">
		<input type = "submit" value="Save Edited Item">
	</form>
</body>
</html>
