
package t_06_ejercicio3_evaluable;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_06_ejercicio3_evaluable
 *
 * Funcion: 
 *          Apartado D
 *          Crearemos una subclase de la clase Cuenta llamada CuentaEmpresa con las siguientes características:
 *              - Dispone de un atributo denominado recargo, será un número entero y corresponde a un tanto por ciento.
 *                Por defecto, el recargo será de 2, por tanto, usa una constante.
 *          Los constructores que se implementarán serán:
 *              - Un constructor por defecto. Asigna el recargo por defecto.
 *              - Un constructor que reciba por parámetro el recargo. El número recibido será menor o igual a 100, en
 *                caso contrario se le asignará el recargo por defecto.
 *          Los métodos que se implementara serán:
 *              - Método get y set del atributo recargo. En el método set, igual que en el constructor deberás verificar
 *                que el número es menor o igual a 100, en caso contrario asigna el valor por defecto.
 *          La clase deberá implementar:
 *              - El método ingresar. Actualizará el saldo de la cuenta bancaria, le sumará la cantidad recibida
 *                por parámetro. Además, habrá que restarle un recargo, para ello calcula el % del recargo
 *                sobre la cantidad de dinero ingresada y réstasela al saldo.
 *              - Método retirar. Retira del saldo la cantidad recibida por parámetro siempre y cuando tenga
 *                saldo suficiente, no olvides actualizar el saldo y devolver el valor de TRUE, en caso contrario,
 *                si no dispone de saldo suficiente, no realizará ninguna operación y devolverá FALSE.
 *              - Método transferir. Transfiere la cantidad de dinero recibida por parámetro a la cuenta
 *                destino recibida siempre y cuando la cuenta origen tenga saldo suficiente, además se le
 *                aplicará un recargo, que corresponde al % del recargo sobre la cantidad a transferir (este
 *                recargo se le resta al saldo de la cuenta origen, por tanto, en su cuenta deberá tener saldo
 *                suficiente más el recargo que se le aplicaría), y devolverá el valor de TRUE, en caso contrario,
 *                no realizará ninguna operación y devolverá FALSE.
 */
public class CuentaEmpresa extends Cuenta{
   //DECLARACION DE CONSTANTES//
    private int recargo = RECARGO_DEFAULT;
    
   //DECLARACION DE VARIABLES//
    private static final int RECARGO_DEFAULT = 2;

    public CuentaEmpresa() 
    {
        recargo = RECARGO_DEFAULT;
    }

    public CuentaEmpresa(int recargo, double saldoDisponible, Persona propietario, char[] codigoEntidad,
            char[] codigoSucursal, char[] digitoControl, char[] numeroCuenta) 
    {
        super(saldoDisponible, propietario, codigoEntidad, codigoSucursal, digitoControl, numeroCuenta);
        if(recargo <= 100)
        {
            this.recargo = recargo;
        }
        else
            this.recargo = RECARGO_DEFAULT;
    }

    public int getRecargo() {
        return recargo;
    }

    public void setRecargo(int recargo) {
        if(recargo <= 100)
        {
            this.recargo = recargo;
        }
        else
            this.recargo = RECARGO_DEFAULT;
    }

    public void ingresar(int ingresos)
    {
        super.saldoDisponible *= 100;
        super.saldoDisponible += (ingresos*100);
        super.saldoDisponible -= (calculoRecargo(ingresos)*100);
        super.saldoDisponible /= 100;
    }
    
    public double calculoRecargo(double ingresos)
    {
        double bonificacion = Math.round(ingresos * recargo * 100) / 100;
        return(bonificacion/100);
    }
    
    public boolean retirar(double retirado)
    {
        if(saldoDisponible >= retirado)
        {
            saldoDisponible -= retirado;
            return true;
        }
        else
            return false;
    }
    
    public boolean transferir(double transferido, Cuenta objetivo)
    {
        if(this.saldoDisponible >= (transferido + calculoRecargo(transferido)))
        {
            this.saldoDisponible -= (transferido + calculoRecargo(transferido));
            objetivo.setSaldoDisponible(objetivo.getSaldoDisponible() + transferido);
        }
        return false;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " recargo: " + recargo;
    }
}