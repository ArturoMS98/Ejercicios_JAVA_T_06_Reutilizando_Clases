
package t_06_ejercicio1_no_evaluable;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_06_ejercicio1_no_evaluable
 *
 * Funcion: 
 *          Apartado B
 *          Escribe una clase Película que herede de la clase Multimedia anterior. La clase Película
 *          tiene, además de los atributos heredados, un actor principal y una actriz principal. La clase
 *          debe tener dos métodos tanto para obtener como para modificar los nuevos atributos.
 *          Además, debe sobreescribir el método toString() para reflejar la nueva información, es
 *          decir, además de imprimir por pantalla el valor de todos los atributos de su clase padre
 *          (clase Multimedia), deberá mostrar el valor de los atributos propios de la clase película.
 */
public class Pelicula extends Multimedia{
    private String autorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, String formato, double duracion, String autorPrincipal, String actrizPrincipal)
    {
        super.setTitulo(titulo);
        super.setDuracion(duracion);
        super.setAutor(autor);
        super.setFormato(formato);
        this.autorPrincipal = autorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }
    
    public Pelicula()
    {
        
    }
    
    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() + "Pelicula{" + "autorPrincipal=" + autorPrincipal + ", actrizPrincipal=" + actrizPrincipal + '}';
    }
    
    
}
