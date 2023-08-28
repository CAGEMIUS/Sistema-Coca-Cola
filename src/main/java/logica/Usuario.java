package logica;

public class Usuario {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;

    public Usuario() {
    }

    public Usuario(String cedula, String nombre, String apellido, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
}