// Estos son los paquetes.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//Esta es la clase.
public class CrudUser {
	
	//Este es el metodo.
	public static void main(String[] args) {
		try {
			//Estas son las variables.
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3305/coca-cola","root",""); //Conexion de la base de datos
			
			Statement miStatement = miConexion.createStatement();
			
			ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM USUARIOS");
			
			Scanner scanner = new Scanner(System.in);
			
			//Codificacion del CRUD de la base de datos.
	        while (true) {
	            System.out.println("Binevenido al sistema de la base de datos de The Coca-Cola Company:");
	            System.out.println("Que quieres hacer?");
	            System.out.println("1. Agregar usuario");
	            System.out.println("2. Obtener usuario por ID");
	            System.out.println("3. Actualizar usuario");
	            System.out.println("4. Eliminar usuario");
	            System.out.println("5. Salir");
	            System.out.print("Elije por favor una opcion: ");

	            int opcion = scanner.nextInt();

	            if (opcion == 1) {
	                System.out.println("Ingrese el nombre del usuario:");
	                String nombre = scanner.next();
	                System.out.println("Ingrese el email del usuario:");
	                String email = scanner.next();
	                System.out.println("Ingrese la contraseña del usuario:");
	                String password = scanner.next();

	                //Crud SQL para AGREGAR un nuevo usuario a la base de datos.
	                String sql = "INSERT INTO USUARIOS (Nombre, Email, Password) VALUES ('" + nombre + "', '" + email + "', '" + password + "')";
	                miStatement.executeUpdate(sql);
	                System.out.println("Usuario agregado correctamente.");
	            }
	            if (opcion == 2) {
	                System.out.println("Ingrese el ID del usuario: ");
	                int id = scanner.nextInt();

	                // Crud SQL para CONSULTAR un usuario por ID.
	                String sql = "SELECT * FROM USUARIOS WHERE Id_Usuario = " + id;
	                ResultSet usuario = miStatement.executeQuery(sql);

	                if (usuario.next()) {
	                    System.out.println("Nombre: " + usuario.getString("Nombre"));
	                    System.out.println("Email: " + usuario.getString("Email"));
	                    System.out.println("Contraseña: " + usuario.getString("Password"));
	                } else {
	                    System.out.println("Usuario no encontrado.");
	                }
	            }
	            if (opcion == 3) {
	                System.out.println("Ingrese el ID del usuario que desea actualizar: ");
	                int id = scanner.nextInt();
	                System.out.println("Ingrese el nuevo nombre del usuario: ");
	                String nuevoNombre = scanner.next();
	                System.out.println("Ingrese el nuevo email del usuario :");
	                String nuevoEmail = scanner.next();
	                System.out.println("Ingrese la nueva contraseña del usuario: ");
	                String nuevaPassword = scanner.next();

	                //Crud SQL para ACTUALIZAR un usuario por ID.
	                String sql = "UPDATE USUARIOS SET Nombre = '" + nuevoNombre + "', Email = '" + nuevoEmail + "', Password = '" + nuevaPassword + "' WHERE Id_Usuario = " + id;
	                int filasActualizadas = miStatement.executeUpdate(sql);

	                if (filasActualizadas > 0) {
	                    System.out.println("Usuario actualizado correctamente.");
	                } else {
	                    System.out.println("Usuario no encontrado.");
	                }
	            }
	            if (opcion == 4) {
	                System.out.println("Ingrese el ID del usuario que desea eliminar: ");
	                int id = scanner.nextInt();

	                //Crud SQL para ELIMINAR un usuario por ID.
	                String sql = "DELETE FROM USUARIOS WHERE Id_Usuario = " + id;
	                int filasEliminadas = miStatement.executeUpdate(sql);

	                if (filasEliminadas > 0) {
	                    System.out.println("Usuario eliminado correctamente.");
	                } else {
	                    System.out.println("Usuario no encontrado.");
	                }
	            }
	        }
		} catch (Exception e) {
			System.out.println("Error, no hay una conexion a la base de datos");
			
			e.printStackTrace();
		}
	}
}