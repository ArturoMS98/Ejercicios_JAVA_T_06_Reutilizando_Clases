package t_06_ejercicio3_evaluable;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jul 30, 2019 3:54:56 PM<p>                                                               *
 * <p>nombre del proyecto: T_06_Ejercicio3_Evaluable.java<p>                                                            *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_06_Reutilizando_Clases">GIT</a></p>                *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función del proyecto:</h1>                                                                                       *
 * <p>Gestionar el banco</p>
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: horas minutos segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_06_Ejercicio3_Evaluable {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Apartado E                                                                                                     *
    *   En la clase principal, debes de instanciar 2 objetos de las clases CuentaNomina y CuentaBancaria (necesitas     *
    *   previamente instanciar 2 objetos Persona), y realiza las siguientes operaciones:                                *
    *   1. Muestra los datos de cada cuenta utilizando el método toString().                                            *
    *   2. Pide al usuario por teclado que realice un ingreso sobre la CuentaNomina. Deberás mostrar el saldo antes y   *
    *      después de realizar el ingreso.                                                                              *
    *   3. Pide al usuario por teclado que realice una retirado sobre la CuentaEmpresa. Muestra el saldo antes y        *
    *      después de realizar la retirada.                                                                             *
    *   4. Realiza una transferencia (que se pueda realizar, es decir, con una cantidad inferior al saldo disponible)   *
    *      de una CuentaNomina a la CuentaEmpresa y muestra los datos con el método toString de cada cuenta.            *
    *   5. Realiza una transferencia (que se no pueda realizar) de una CuentaEmpresa a la CuentaNomina y muestra los    *
    *      datos con el método toString de cada cuenta para verificar que la cuenta no se ha realizado.</p>             *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
       // CONSTANTES LOCALES //
        char[] codigoEntidad1 = {'2','2','2','2'};
        char[] codigoSucursal1 = {'2','2','2','2'};
        char[] digitoControl1 = {'2','2'};
        char[] numeroCuenta1 = {'2','2','2','2','2','2','2','2','2','2'};
       
        char[] codigoEntidad2 = {'4','4','4','4'};
        char[] codigoSucursal2 = {'0','1','3','5'};
        char[] digitoControl2 = {'4','2'};
        char[] numeroCuenta2 = {'5','5','4','2','1','4','3','8','4','1'};
        
       //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        
       //OBJETOS PERSONA//
        Persona paco = new Persona("111111111", "Paco", "Perales", "paco1992@hotmail.com", "111111111");
        Persona manu = new Persona("222222222", "Manu", "Pocohal", "manu1994@hotmail.com", "333333333");
       
       //OBJETOS CUENTA//
        CuentaNomina cuenta1 = new CuentaNomina(80, 99999, paco, codigoEntidad1, codigoSucursal1, digitoControl1, numeroCuenta1);
        CuentaEmpresa cuenta2 = new CuentaEmpresa(40, 23456, manu, codigoEntidad2, codigoSucursal2, digitoControl2, numeroCuenta2);
        
        //FRONTEND//
            //MOSTRAMOS DATOS DE LAS CUENTAS//
            System.out.println(cuenta1.toString());
            System.out.println(cuenta2.toString());
            
            //OPERACION SOBRE CUENTA1//
            System.out.println("\nAntes de ingresar: " + cuenta1.getSaldoDisponible());
            System.out.print("\nIntroduzca ahora lo que se quiere ingresar a la nomina: ");
            cuenta1.ingresar(in.nextDouble());
            System.out.println("\nBonificacion: " + cuenta1.getInteresBonificacion() + "\nDespues de ingresar: " + cuenta1.getSaldoDisponible());
            
            //OPERACION SOBRE CUENTA2//
            System.out.println("\nAntes de retirar: " + cuenta2.getSaldoDisponible());
            System.out.println("Introduzca lo que se quiere retirar de la cuenta de la empresa: ");
            cuenta2.retirar(in.nextDouble());
            System.out.println("\nDespues de retirar: " + cuenta2.getSaldoDisponible());
            
            //TRANSFERENCIA DE LA CUENTA2 A LA CUENTA1//
            System.out.println("ANTES DE LA TRANSFERENCIA: " + cuenta2.getSaldoDisponible());
            System.out.println("COMISION: " + cuenta2.getRecargo() + "\nIntruduzca cuánto quiere transferir de la cuenta de la empresa a la nómina: ");
            cuenta2.transferir(in.nextDouble(), cuenta1);
            System.out.println("DESPUES DE LA TRANSFERENCIA: " + cuenta2.getSaldoDisponible());
                //puedes dejar 21000 en la cuenta2 y transferir 15000 para que se quede a 0.//
            //TRANSFERENCIA IRREALIZABLE (AUTOMATICA)//
            System.out.println("\n\nAHORA SE HARÁ UNA TRANSFERENCIA IRREALIZABLE: ");
            cuenta2.transferir(cuenta2.getSaldoDisponible(), cuenta1);
            System.out.println("SALDO DISPONIBLE EN LA CUENTA DE EMPRESA: " + cuenta2.getSaldoDisponible());
            System.out.println(cuenta2.toString());
            System.out.println(cuenta1.toString());
        //BACKEND//
    }
}