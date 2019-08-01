package t_06_ejercicio2_no_evaluable;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jul 24, 2019 4:57:36 PM<p>                                                               *
 * <p>nombre del proyecto: T_06_Ejercicio2_No_Evaluable.java<p>                                                         *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_06_Reutilizando_Clases">GIT</a></p>                *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función del proyecto:</h1>                                                                                       *
 * <p>Apartado D                                                                                                        *
 *      En la clase principal, instancia un objeto de tipo Lavadora y otro de tipo Televisión. Visualiza                *
 *      su precio final y verifica que el precio devuelto es correcto.</p>                                              *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 2 horas 32 minutos 42 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_06_Ejercicio2_No_Evaluable {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Almacena los datos de los electrodomésticos y los utiliza para manipular sus datos.</p>                        *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
            //LAVADORA 1//
        final double CARGA_LAV_1 = 50.4;
        final double PRECIO_BASE_LAV_1 = 100.9;
        final String COLOR_LAV_1 = "azul";
        final char CONSUMO_ENERGETICO_LAV_1 = 'A';
        final double PESO_LAV_1 = 90;
            //TELEVISION 1//
        double PULGADAS_TELE_1 = 40;
        boolean TDT_TELE_1 = true;
        double PRECIO_BASE_TELE_1 = 60;
        String COLOR_TELE_1 = "blanco";
        char CONSUMO_ENERGETICO_TELE_1 = 'C';
        double PESO_TELE_1 = 90;
        
            //LAVADORA1//
        Lavadora lavadora1 = new Lavadora(CARGA_LAV_1, PRECIO_BASE_LAV_1, COLOR_LAV_1, CONSUMO_ENERGETICO_LAV_1, PESO_LAV_1);
            //TELEVISION1//
        Television television1 = new Television(PULGADAS_TELE_1, TDT_TELE_1, PRECIO_BASE_TELE_1, COLOR_TELE_1, CONSUMO_ENERGETICO_TELE_1, PESO_TELE_1);
        
        
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.println("Precio de la lavadora: " + lavadora1.precioFinal());
            System.out.println("Precio de la television: " + television1.precioFinal());
    }
}