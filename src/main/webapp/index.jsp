
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema GET y POTS</title>
    </head>
    <body>
        <!-- Metodo POST -->
        <h1 style="text-align: center; color: red; font-size: 85px">Bienvenido usuario al sistema de Coca-Cola</h1>
        <h1 style="color: red; text-align: center">Ingresa los datos por favor, para registrarlo en el sistema</h1>
        <form action="SvUsarios" method="POST">
            <p style="text-align: center; font-weight: bold; font-size: 35px"><label>Cedula: </label> <input type="text" name="cedula"></p>
            <p style="text-align: center; font-weight: bold; font-size: 35px"><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p style="text-align: center; font-weight: bold; font-size: 35px"><label>Apellido: </label> <input type="text" name="apellido"></p>
            <p style="text-align: center; font-weight: bold; font-size: 35px"><label>Telefono: </label> <input type="text" name="telefono"></p>
            <button type="submit" style="font-weight: bold; font-size: 35px">Enviar</button>
        </form>
        
        <!-- Metodo GET -->
        <h1 style="color: red; font-size: 45px">Lista de usuarios registrados en el sistema</h1>
        <p style="font-weight: bold; font-size: 30px">Para ver los usuarios haga click en el boton</p>
        <form action="SvUsarios" method="GET">
            <button type="submit" style="color: red; font-size: 25px"> Click aqui, para mostrar usuarios</button>
        </form>
    </body>
</html>
