
package t_06_ejercicio3_evaluable;

import java.text.DecimalFormat;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_06_ejercicio3_evaluable
 *
 * Funcion: 
 *          Apartado C
 *          Crearemos una subclase de la clase Cuenta llamada CuentaNomina con las siguientes características:
 *              - Dispone de un atributo denominado interesBonificacion, será un número entero y corresponde a un tanto
 *                por ciento.
 *              - Por defecto, el interesBonificación será de 5, por tanto, usa una constante.
 *          Los constructores que se implementarán serán:
 *              - Un constructor por defecto. Asigna el interesBonificacion por defecto.
 *              - Un constructor que reciba por parámetro el interesBonificacion. El número recibido será menor o
 *              - igual a 100, en caso contrario se le asignará el interesBonificacion por defecto.
 *          Los métodos que se implementara serán:
 *              - Método get y set del atributo interesBonificacion. En el método set, igual que en el constructor
 *                deberás verificar que el número es menor o igual a 100, en caso contrario asigna el valor por
 *                defecto.
 *          La clase deberá implementar:
 *              - El método ingresar. Actualizará el saldo de la cuenta bancaria, le sumará la cantidad recibida
 *                por parámetro. Además, habrá que sumarle una bonificación, para ello calcula el % del
 *                interesBonificación sobre la cantidad de dinero ingresada y súmasela al saldo.
 *              - Método retirar. Retira del saldo la cantidad recibida por parámetro siempre y cuando tenga
 *                saldo suficiente, no olvides actualizar el saldo y devolver el valor de TRUE, en caso contrario,
 *                si no dispone de saldo suficiente, no realizará ninguna operación y devolverá FALSE.
 *              - Método transferir. Transfiere la cantidad de dinero recibida por parámetro a la cuenta
 *                destino recibida siempre y cuando la cuenta origen tenga saldo suficiente, y devolverá el
 *                valor de TRUE, en caso contrario, no realizará ninguna operación y devolverá FALSE.
 * 
 * tiempo actual: 2 horas 50 minutos + tiempo en hacer la mitad de esta clase, + 1 hora y media. mas o menos 5 horas.
 * tiempo excesivo. tengo que ser más rápido.
 */
public class CuentaNomina extends Cuenta{
   //DECLARACION DE CONSTANTES//
    private final int INTERESBONIFICACION_DEFAULT = 5;
    
   //DECLARACION DE VARIABLES//
    private int interesBonificacion = INTERESBONIFICACION_DEFAULT;
    
   //CONSTRUCTORES//
    public CuentaNomina()
    {
        super();
        interesBonificacion = INTERESBONIFICACION_DEFAULT;
    }
    public CuentaNomina(int interesBonificacion, double saldoDisponible, Persona propietario, char[] codigoEntidad, char[] codigoSucursal,
            char[] digitoControl, char[] numeroCuenta)
    {
        super(saldoDisponible, propietario, codigoEntidad, codigoSucursal, digitoControl, numeroCuenta);
        if(interesBonificacion <= 100)
            this.interesBonificacion = interesBonificacion;
        else
            this.interesBonificacion = INTERESBONIFICACION_DEFAULT;
    }
   
   //GETTERS//
    public int getInteresBonificacion()
    {
        return interesBonificacion;
    }

   //SETTERS//
    public void setInteresBonificacion(int interesBonificacion)
    {
        if(interesBonificacion <= 100)
            this.interesBonificacion = interesBonificacion;
        else
            this.interesBonificacion = INTERESBONIFICACION_DEFAULT;
    }
    
   //METODOS DE LA CLASE//
    public void ingresar(double ingreso)
    {
        super.saldoDisponible *= 100;
        super.saldoDisponible += (ingreso*100);
        super.saldoDisponible += (calculoBonificacion(ingreso)*100);
        super.saldoDisponible /= 100;
    }
    
    public double calculoBonificacion(double bonificante)
    {
        double bonificacion = Math.round(bonificante * interesBonificacion * 100) / 100;
        return(bonificacion/100);
    }
    
    public boolean retirar(double cantidad)
    {
        if(saldoDisponible >= cantidad)
        {
            saldoDisponible -= cantidad;
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return super.toString() + " CuentaNomina{" + "interesBonificacion=" + interesBonificacion + '}';
    }
    
    
}