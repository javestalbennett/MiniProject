<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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