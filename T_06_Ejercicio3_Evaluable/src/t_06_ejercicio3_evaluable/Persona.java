
package t_06_ejercicio3_evaluable;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_06_ejercicio3_evaluable
 *
 * Funcion: 
 *          Apartado A
 *          Crea una clase denominada Persona con las siguientes características:
 *              - Sus atributos son dni, nombre, apellidos, email y móvil.
 *          Los constructores a implementar serán:
 *              - Constructor por defecto.
 *              - Un constructor que inicializa a través de parámetros todos los atributos de la clase.
 *          Los métodos que implementara serán:
 *              - Métodos get y set de todos los atributos.
 */
public class Persona {
   //DECLARACION DE VARIABLES//
    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private String movil;
    
   //CONSTRUCTORES//
    public Persona()
    {
        
    }
    
    public Persona(String dni, String nombre, String apellidos, String email, String movil)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.movil = movil;
    }
   //GETTERS//
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getMovil() {
        return movil;
    }
   //SETTERS//
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", movil=" + movil + '}';
    }
    
}