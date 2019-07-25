
package t_06_ejercicio1_no_evaluable;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_06_ejercicio1_no_evaluable
 *
 * Funcion: 
 *          Apartado A
 *          Escribe una clase Multimedia para almacenar información de los objetos de tipo
 *          multimedia (películas, discos, mp3,mp4...). Esta clase contiene título, autor, formato, y
 *          duración como atributos. Esta clase será una superclase, y sus atributos podrán heredarse.
 *          Crea los métodos tanto para consultar como para modificar cada uno de los atributos,
 *          además del constructor por defecto, y un constructor con todos los parámetros asociados a
 *          cada uno de los atributos de la clase. También crea el método toString, que devuelve una
 *          cadena de caracteres con los valores de cada uno de los atributos.
 *          Ten en cuenta que el formato puede ser uno de los siguientes: wav, mp3, midi, avi, mov,
 *          mpg, cdAudio y dvd. Luego tanto en el constructor como en el método que modifica el
 *          atributo formato, deberás verificar que el formato a almacenar corresponde a uno de los
 *          tipos indicados anteriormente (te recomiendo que lo hagas con la sentencia switch).
 *          Por último, crea un método identico() que recibe un objeto de tipo Multimedia y devuelve
 *          true en caso de que el título y el autor sean iguales y false en caso contrario.
 */

public class Multimedia {
    protected String titulo;
    protected String autor;
    protected int formato;
    protected double duracion;
    
    public Multimedia()
    {
        
    }
    
    public Multimedia(String titulo, String autor, String formato, double duracion)
    {
        int codFormato = codificadorFormato(formato);
        this.titulo = titulo;
        this.autor = autor;
        this.formato = codFormato;
        this.duracion = duracion;
    }

    int codificadorFormato(String formato)
    {
        switch(formato)
        {
            case "wav": return 1;
            case "mp3": return 2;
            case "midi": return 3;
            case "avi": return 4;
            case "mov": return 5;
            case "mpg": return 6;
            case "cdAudio": return 7;
            case "dvd": return 8;
            default: return 0;
        }
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(String formato) {
        int codFormato = codificadorFormato(formato);
        this.formato = codFormato;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    boolean identico(Multimedia objeto)
    {
        return objeto.getTitulo().equals(objeto.getAutor());
    }

    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion + '}';
    }
    
    
}
