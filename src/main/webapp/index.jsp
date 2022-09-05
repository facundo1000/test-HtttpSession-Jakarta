<%@ page contentType="text/html;" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Tarea 5: Session HTTP</title>
</head>
<body>
<h3>Tarea 5: Session HTTP</h3>
<p>Hola <%=session.getAttribute("nombre") != null ? session.getAttribute("nombre") : "anónimo"%>, bienvenido a la
    tarea5.</p>

<form action="/webapp-session-tarea5/guardar-session" method="post">

    <div>
        <label for="nombre">Ingrese su nombre de sesion</label>
        <div>
            <input type="text" name="nombre" id="nombre">
        </div>
    </div>

    <div>
        <input type="submit" value="Enviar">
    </div>
</form>
</body>
</html>
