<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Caballeros</title>
</head>
<body>
	<h1>Caballeros</h1>
	<table>
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Nombre</th>
				<th scope="col">Fuerza</th>
				<th scope="col">Experiencia</th>
				<th scope="col">Foto</th>
				<th scope="col">ArmaID</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${caballeros}" var="caballero">
				<tr>
					<td>${caballero.id}</td>
					<td>${caballero.nombre}</td>
					<td>${caballero.fuerza}</td>
					<td>${caballero.experiencia}</td>
					<td>${caballero.foto}</td>
					<td>${caballero.arma_id}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>