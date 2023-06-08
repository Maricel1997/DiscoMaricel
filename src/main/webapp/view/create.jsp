<%-- 
    Document   : create
    Created on : 7 jun. 2023, 19:10:26
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
        <title>REGISTRAR DISCO</title>
        <link rel="stylesheet" href="<%=request.getContextPath() %>/webjars/bootstrap/5.3.0-alpha3/dist/css/bootstrap.min.css"/>
        <script defer src="<%= request.getContextPath() %>/webjars/bootstrap/5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-info-subtle">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">PV</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Disco</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <h1 class="text-center text-primary">Registro de disco</h1>
        <div class="container">
            <form action="<%= request.getContextPath()%>/DiscoServlet?action=create" method="POST">
                <div class="mb-3">
                    <label for="autor" class="form-label">Autor:</label> 
                    <input type="text" class="form-control"  name="autor" id="autor" required minlength="1" maxlength="100" placeholder="Nombre de autor">
                </div>
                <div class="mb-3">
                    <label for="titulo" class="form-label">Titulo:</label>
                    <input type="text" class="form-control" name="titulo" id="titulo" required minlength="1" maxlength="100" placeholder="Titulo"/>
                </div>
                <div class="mb-3">
                    <label for="formato" class="form-label">Formato:</label>
                    <input type="text" class="form-control" name="formato" id="formato" required minlength="6" maxlength="50" placeholder="Formato"/>
                </div>
                <div class="mb-3">
                    <label for="genero" class="form-label" >Genero:</label>
                    <input type="text" class="form-control" name="genero" id="genero" required minlength="1" maxlength="100" placeholder="Genero"/>
                </div>
                <div class="mb-3">
                    <label for="duracion" class="form-label" >Duracion:</label>
                    <input type="text" class="form-control" name="duracion" id="duracion" required minlength="1" maxlength="100" placeholder="Duracion"/>
                </div>
                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>
        </div>
    </body>
</html>