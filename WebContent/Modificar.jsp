<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<title>Registro</title>
	</head>
	<body>
		<div class = "container mt-4 col-lg-4">
			<div class = "card col-sm-10">
				<div class = "card-body">
					 <form action="Mycontrolador?menu=Usuarios" method="POST" class = "form-sign">
						<div class = "form-group text-center">
							<h3>Modificar Datos</h3>
							<img src = "img/logo.png" alt = "70" width = "170"/>
							<label>Bienvenidos al sistema</label>
						</div>
						<div class = "form-group">
							<label>Nombres:</label>
							<input type="text" value="${usuario.getNombre()}" name="txtnombre" class="form-control" required>
						</div>
						<div class = "form-group">
							<label>Apellidos:</label>
							<input type="text" value="${usuario.getApellido()}" name="txtapellido" class="form-control" required>
						</div>
						<div class = "form-group">
							<label>Telefono:</label>
							<input type="text" value="${usuario.getTelefono()}" name="txtfono" class="form-control" required>
						</div>
						<div class = "form-group">
							<label>Email:</label>
							<input type="email" value="${usuario.getEmail()}" name="txtcorreo" class="form-control" required>
						</div>																	
						<div class = "form-group">
							<label>Usuario:</label>
							<input type="text" value="${usuario.getUser()}" name="txtuser" class="form-control" required>
						</div>
						<div class = "form-group">
							<label>Contraseña:</label>
							<input type="password" value="${usuario.getPass()}" name="txtpass" class="form-control" required>
						</div>
						<input type="submit" name="accion" value="Actualizar" class="btn btn-primary btn-block">
					</form>
				</div>
			</div>
		</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>	
	</body>
</html>