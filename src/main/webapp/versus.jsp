<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tabla de caballeros</title>
</head>
<body>
        <h2>Datos de caballero 1</h2>
        <table border="1">
            <tr>
                <td>ID:</td>
                <td>${cab1.id}</td>
            </tr>
            <tr>
                <td>Nombre:</td>
                <td>${cab1.nombre}</td>
            </tr>
            <tr>
                <td>Fuerza:</td>
                <td>${cab1.fuerza}</td>
            </tr>
            <tr>
                <td>Experiencia:</td>
                <td>${cab1.experiencia}</td>
            </tr>
            <tr>
                <td>Foto:</td>
                <td>${cab1.foto}</td>
            </tr>
            <tr>
                <td>Arma:</td>
                <td>${cab1.arma.nombre}, ${cab1.arma.capacidad_danio}</td>
            </tr>
            <tr>
                <td>Escudo:</td>
                <td>${cab1.escudo.nombre}, ${cab1.escudo.capacidad_defensa}</td>
            </tr>
        </table>
        <h2>Datos de caballero 2</h2>
        <table border="1">
            <tr>
                <td>ID:</td>
                <td>${cab2.id}</td>
            </tr>
            <tr>
                <td>Nombre:</td>
                <td>${cab2.nombre}</td>
            </tr>
            <tr>
                <td>Fuerza:</td>
                <td>${cab2.fuerza}</td>
            </tr>
            <tr>
                <td>Experiencia:</td>
                <td>${cab2.experiencia}</td>
            </tr>
            <tr>
                <td>Foto:</td>
                <td>${cab2.foto}</td>
            </tr>
            <tr>
                <td>Arma:</td>
                <td>${cab2.arma.nombre}, ${cab2.arma.capacidad_danio}</td>
            </tr>
            <tr>
                <td>Escudo:</td>
                <td>${cab2.escudo.nombre}, ${cab2.escudo.capacidad_defensa}</td>
            </tr>
        </table>
</body>
</html>
