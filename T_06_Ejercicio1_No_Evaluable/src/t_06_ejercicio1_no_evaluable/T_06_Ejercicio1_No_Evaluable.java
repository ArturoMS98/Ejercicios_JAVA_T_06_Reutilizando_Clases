package t_06_ejercicio1_no_evaluable;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jul 24, 2019 1:28:21 PM<p>                                                               *
 * <p>nombre del proyecto: T_06_Ejercicio1_No_Evaluable.java<p>                                                         *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_06_Reutilizando_Clases">GIT</a></p>                *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase principal:</h1>                                                                              *
 * <p>Apartado D                                                                                                        *
 *    Por último, crea una clase principal e instancia un objeto de tipo Pelicula y otro de tipo                        *
 *    Disco, e imprime por pantalla todos sus datos utilizando el método toString().</p>                                *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 47 minutos 01 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_06_Ejercicio1_No_Evaluable {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Crear un objeto Pelicula, otro objeto Disco, e imprimir sus datos con toString()</p>                           *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        Pelicula peli1 = new Pelicula();
        Pelicula peli2 = new Pelicula("El rey león", "paco", "misi", 12.90, "pedro", "ana");
        
        Disco disco1 = new Disco();
        Disco disco2 = new Disco("Rebirth", "paco", "mp3", 40.25, "skillet", "19/10/19");
        
        System.out.println(peli1.toString());
        System.out.println(disco1.toString());
        
        System.out.println("nyan");
        
        System.out.println(peli2.toString());
        System.out.println(disco2.toString());
    }
}