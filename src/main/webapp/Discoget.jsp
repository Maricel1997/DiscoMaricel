<%-- 
    Document   : Discoget
    Created on : 7 jun. 2023, 19:17:28
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Disco</h1>
        <form action="<%= request.getContextPath()%>/DiscoServlet" method="GET">
             <label>Autor:</label>
            <input type="text" name="autor">
            <br>
            <label>Titulo:</label>
            <input type="text" nome="titulo">
            <br>
            <label>Formato:</label>
            <input type="text" name="formato">
            <br>
            <label>Genero:</label>
            <input type="text" name="">
            <br>
            <label>Duracion:</label>
            <input type="text" email="duracion">
            <br>
            <input type="submit" value="Registrar">
    </body>
</html>
