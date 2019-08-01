
package t_06_ejercicio3_evaluable;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_06_ejercicio3_evaluable
 *
 * Funcion: 
 *          Apartado B
 *          Crearemos una superclase llamada Cuenta con las siguientes características:
 *              - Sus atributos son: el código de la entidad (4 cifras), código de la sucursal (4 cifras),
 *                                   el dígito de control (2 cifras), el número de cuenta (10 cifras), además del saldo
 *                                   disponible en la cuenta. Además, dispone de un objeto de la clase Persona, que será
 *                                   la propietaria de la cuenta. Todos estos atributos se podrán heredar.
 *              - Los constructores que se implementarán serán:
 *                  - Un constructor por defecto. Por defecto el saldo será de 0.0 (usa una constante para ello)
 *                  - Un constructor que inicializa a través de parámetros todos los atributos de la clase.
 *              - Los métodos que implementara serán:
 *                  - Métodos get y set de todos los atributos.
 *                  - toString(). Devolverá una cadena de caracteres, donde se visualice el nombre y apellidos del
 *                                propietario de la cuenta, junto con el número de la cuenta bancaria y el saldo
 *                                disponible.
 */
public class Cuenta {
   //DECLARACION DE VARIABLES//
    protected char[] codigoEntidad = new char[4];
    protected char[] codigoSucursal = new char[4];
    protected char[] digitoControl = new char[2];
    protected char[] numeroCuenta = new char[10];
    protected double saldoDisponible;
    protected Persona propietario;
    
   //CONSTANTES AUXILIARES
    final double SALDO_DEFAULT = 0.0;
    
   //CONSTRUCTORES//
    public Cuenta()
    {
        saldoDisponible = SALDO_DEFAULT;
    }

    public Cuenta(double saldoDisponible, Persona propietario, char[] codigoEntidad, char[] codigoSucursal,
            char[] digitoControl, char[] numeroCuenta) {
        this.saldoDisponible = saldoDisponible;
        this.propietario = propietario;
        for(int i = 0; i < codigoEntidad.length; i++)
        {
            this.codigoEntidad[i] = codigoEntidad[i];
        }
        for(int i = 0; i < codigoSucursal.length; i++)
        {
            this.codigoSucursal[i] = codigoSucursal[i];
        }
        System.arraycopy(digitoControl, 0, this.digitoControl, 0, digitoControl.length);
        System.arraycopy(numeroCuenta, 0, this.numeroCuenta, 0, numeroCuenta.length);
    }

   //GETTERS//
    public String getCodigoEntidad() {
        return arrayToString(codigoEntidad);
    }

    public String getCodigoSucursal() {
        return arrayToString(codigoSucursal);
    }

    public String getDigitoControl() {
        return arrayToString(digitoControl);
    }

    public String getNumeroCuenta() {
        return arrayToString(numeroCuenta);
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public Persona getPropietario() {
        return propietario;
    }
   
   //SETTERS//
    public void setCodigoEntidad(char[] codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }

    public void setCodigoSucursal(char[] codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public void setDigitoControl(char[] digitoControl) {
        this.digitoControl = digitoControl;
    }

    public void setNumeroCuenta(char[] numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
   //TOSTRING//
    public String arrayToString(char[] arrayCaracteres)
    {
        String cadena = new String();
        for(int i = 0; i < arrayCaracteres.length; i++)
        {
            cadena = cadena + arrayCaracteres[i];
        }
        return cadena;
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "codigoEntidad=" + arrayToString(codigoEntidad) + ", codigoSucursal=" + 
                arrayToString(codigoSucursal) + ", digitoControl=" + arrayToString(digitoControl) + ", numeroCuenta=" +
                arrayToString(numeroCuenta) + ", saldoDisponible=" + saldoDisponible + ", propietario=" + propietario + '}';
    }
    
}
