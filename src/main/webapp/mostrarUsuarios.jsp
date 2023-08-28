<%@page import="java.util.List" %>
<%@page import="logica.Usuario" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios registrados</title>
    </head>
    <body>
        <!-- Se crea una lista -->
        <h1 style="text-align: center; color: red">Estos son los usuarios registrados :)</h1>
        <%
            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int cont = 1;
                for(Usuario usu : listaUsuarios){
        %>
                <p style="text-align: center; color: red"><b>Usuario # <%=cont%></b></p>
                <p style="text-align: center">Cedula: <%=usu.getCedula()%> </p>
                <p style="text-align: center">Nombre: <%=usu.getNombre()%></p>
                <p style="text-align: center">Apellido: <%=usu.getApellido()%></p>
                <p style="text-align: center">Telefono <%=usu.getTelefono()%></p>
                <p style="text-align: center">---------------------------------------------</p>
                <% cont = cont + 1;%>
        
        <% } %>
    </body>
</html>
