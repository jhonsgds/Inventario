<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<title>Bienes</title>
	</head>
    <body>        
        <div class="d-flex">
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-body">
                        <form action="Mycontrolador?menu=Bien" method="POST">
                            <div class="form-group">
                            	<label>Categoria</label>
                        		<input type="text" value="${bien.getIdc()}" name="txtCategoria" class="form-control">
                        	</div>	
                            <div class="form-group">
                                <label>Codigo</label>
                                <input type="text" value="${bien.getCodigo()}" name="txtCodigo" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Nombre</label>
                                <input type="text" value="${bien.getNombre()}" name="txtNombre" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Estado</label>
                                <select name="txtEstado" class="form-control">
                                	<option>Seleccione</option>
                                	<option>Operativo</option>
                                	<option>Inoperativo</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Ubicacion</label>
                                <input type="text" value="${bien.getUbicacion()}" name="txtUbicacion" class="form-control">
                            </div>                        
                            <input type="submit" name="accion" value="Agregar" class="btn btn-primary">
                            <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                        </form>
                    </div>                         
                </div>
            </div>                     
            <div class="col-sm-8">
                <div class="card">
                    <div class="card-body">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Categoria</th>
                                    <th>Codigo</th>
                                    <th>Nombre</th>
                                    <th>Estado</th>                                    
                                    <th>Ubicacion</th>                                    
                                    <th>ACCIONES</th>
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="bn" items="${bienes}">
                                    <tr>
                                        <td>${bn.getId()}</td> 
                                        <td>${bn.getTipo()}</td>                                  
                                        <td>${bn.getCodigo()}</td>
                                        <td>${bn.getNombre()}</td>
                                        <td>${bn.getEstado()}</td>
                                        <td>${bn.getUbicacion()}</td>
                        				</td>                                        
                                        <td>
                                            <a class="btn btn-warning" href="Mycontrolador?menu=Bien&accion=Editar&id=${bn.getId()}">Editar</a>
                                            <a class="btn btn-danger" href="Mycontrolador?menu=Bien&accion=Eliminar&id=${bn.getId()}">Eliminar</a>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>      
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>	
	</body>
</html>