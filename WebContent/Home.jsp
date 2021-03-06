<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<title>Home</title>
	</head>
	<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-info">
 	 <div class="collapse navbar-collapse" id="navbarNav">
   	 	<ul class="navbar-nav">
     	 	<li class="nav-item">
      	  		<a style="margin-left: 10px; border: none" class="btn btn-outline-light" href=#>Home</a>
     	 	</li>
     	 	<li class="nav-item">
      	  		<a style="margin-left: 10px; border: none" class="btn btn-outline-light"  href="Mycontrolador?menu=Bien&accion=mostrar" target="myFrame">Bienes</a>
      		</li>
      		<li class="nav-item">
      		  	<a style="margin-left: 10px; border: none" class="btn btn-outline-light"  href="Mycontrolador?menu=Categoria&accion=mostrar" target="myFrame">Categorias</a>
      		</li>
     	 	<li class="nav-item">
        		<a style="margin-left: 10px; border: none" class="btn btn-outline-light"  href="Mycontrolador?menu=Usuarios&accion=mostrar" target="myFrame">Usuarios</a>
      		</li>
      		
    	</ul>
    </div>
    	<div class="dropdown">
  			<button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
   				  ${usuario.getNombre()}
  			</button>
            <div class="dropdown-menu dropdown-menu-lg-right text-center">
            	<a class="dropdown-item" href="#">
                	<img src="img/user.jfif" alt="60" width="60"/>
                </a>
                <a class="dropdown-item" >${usuario.getUser()}</a>
                <a class="dropdown-item" >${usuario.getEmail()}</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item " href="Mycontrolador?menu=Usuarios&accion=Editar&id=${usuario.getId()}">Modificar</a>
                <a class="dropdown-item" href="validar?accion=Salir">Salir</a>
             </div>
		</div>
  	</div>
	</nav>
		<div class="embed-responsives m-4" style="height: 530px;">
        	<iframe class="embed-responsive-item" name="myFrame"  style="height: 100%; width: 100%; border:navy"></iframe>
        </div>   
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>	
	</body>
</html>