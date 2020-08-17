<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<title>Usuarios</title>
	</head>
	<body>
		<h1>Usuarios</h1>
        <div>
			<table class = "table table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nombres</th>
						<th>Apellidos</th>
						<th>Telefono</th>
						<th>Email</th>
						<th>Usuario</th>	
						<th>User</th>
					</tr>
				</thead>
                <tbody> 
                   	<c:forEach var="us" items="${usuario}">
                    <tr>
                        <td>${us.getId()}</td>
                        <td>${us.getNombre()}</td>
                        <td>${us.getApellido()}</td>
                        <td>${us.getTelefono()}</td>
                        <td>${us.getEmail()}</td>
                        <td>${us.getUser()}</td>
                        <td>                        
                   	</tr>
                    </c:forEach>
             	</tbody>
			</table>
		</div>                             
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>	
	</body>
</html>