
package t_06_ejercicio1_no_evaluable;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_06_ejercicio1_no_evaluable
 *
 * Funcion: 
 *          Apartado C
 *          Escribe una clase Disco que herede de la clase Multimedia anterior. La clase Disco tiene,
 *          además de los atributos heredados, el nombre del grupo musical, y la fecha de lanzamiento
 *          del disco. La clase debe tener dos métodos para obtener los nuevos atributos. Además,
 *          debe sobreescribir el método toString() para reflejar la nueva información, es decir, además
 *          de imprimir por pantalla el valor de todos los atributos de su clase padre (clase
 *          Multimedia), deberá mostrar el valor de los atributos propios de la clase disco.
 */
public class Disco extends Multimedia{
    String nombreGrupoMusical;
    String fechaLanzamiento;

    public Disco(String titulo, String autor, String formato, double duracion, String nombreGrupoMusical, String fechaLanzamiento)
    {
        super.setTitulo(titulo);
        super.setDuracion(duracion);
        super.setAutor(autor);
        super.setFormato(formato);
        this.nombreGrupoMusical = nombreGrupoMusical;
        this.fechaLanzamiento = fechaLanzamiento;
    }
    
    public Disco()
    {
        
    }
    
    public String getNombre() {
        return nombreGrupoMusical;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    @Override
    public String toString() {
        return super.toString() + "Disco{" + "nombre=" + nombreGrupoMusical + ", fechaLanzamiento=" + fechaLanzamiento + '}';
    }
}