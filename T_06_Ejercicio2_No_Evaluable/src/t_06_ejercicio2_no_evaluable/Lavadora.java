
package t_06_ejercicio2_no_evaluable;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_06_ejercicio2_no_evaluable
 *
 * Funcion: 
 *          Apartado B
 *          Crearemos una subclase llamada Lavadora con las siguientes características:
 *          - Su atributo es carga, además de los atributos heredados.
 *          - Por defecto, la carga es de 5 kg. Usa una constante para ello.
 *          - Los constructores que se implementarán serán:
 *                  - Un constructor por defecto.
 *                  - Un constructor con el precio y peso. El resto por defecto.
 *                  - Un constructor con la carga y el resto de atributos heredados. Recuerda que
 *                    debes llamar al constructor de la clase padre.
 *          Los métodos que se implementara serán:
 *          - Método get de carga.
 *          - precioFinal(): si tiene una carga mayor de 30 kg, aumentara el precio 50 €,
 *            sino es así, no se incrementara el precio. Llama al método padre y añade el
 *            código necesario.
 */
public class Lavadora extends Electrodomestico{
   //CONSTANTES//
    private static final int CARGA_DEFAULT = 5;
    
   //VARIABLES//
    double carga = CARGA_DEFAULT;
    
   //CONSTRUCTORES//
    public Lavadora()
    {
        
    }
    
    public Lavadora(int precio, int peso)
    {
        super(precio, peso);
    }
    
    public Lavadora(double carga, double precioBase, String color, char consumoEnergetico, double peso)
    {
        super(precioBase, color, consumoEnergetico, peso);
    }

    public double getCarga() {
        return carga;
    }
    
    public double precioFinal()
    {
        if(peso > 30)
            return (super.precioFinal(super.precioBase, super.peso, super.consumoEnergetico) + 50);
        else
            return super.precioFinal(super.precioBase, super.peso, super.consumoEnergetico);
    }
}
