
package t_06_ejercicio2_no_evaluable;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_06_ejercicio2_no_evaluable
 *
 * Funcion: 
 *          Apartado C
 *          Crearemos una subclase llamada Television con las siguientes características:
 *          - Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano),
 *            ademas de los atributos heredados.
 *          - Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.
 *          - Los constructores que se implementarán serán:
 *                  - Un constructor por defecto.
 *                  - Un constructor con el precio y peso. El resto por defecto.
 *                  - Un constructor con la resolución, sintonizador TDT y el resto de atributos
 *                    heredados. Recuerda que debes llamar al constructor de la clase padre.
 *          Los métodos que se implementara serán:
 *                  - Método get de resolución y sintonizador TDT.
 *                  - precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara
 *                    el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €.
 *                    Recuerda que las condiciones que hemos visto en la clase Electrodomestico
 *                    también deben afectar al precio.
 */
public class Television extends Electrodomestico{
   //VARIABLES LOCALES//
    private static final boolean TDT_DEFAULT = false;
    private static final int PULGADAS_DEFAULT = 20;
    
    private double pulgadas = PULGADAS_DEFAULT;
    private boolean tdt = TDT_DEFAULT;
    
   //CONSTRUCTORES//
    Television()
    {
        
    }
    Television(double precio, double peso)
    {
        super(precio, peso);
    }
    Television(double pulgadas, boolean tdt, double precioBase, String color, char consumoEnergetico, double peso)
    {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }
   //METODOS GETTER//
    public double getPulgadas()
    {
        return pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }
   //METODOS AUXILIARES//
    public double precioFinal()
    {
        double precioFinal = super.precioFinal(super.precioBase, super.peso, super.consumoEnergetico);
        if(pulgadas > 40)
        {
            precioFinal += precioFinal*30/100;
        }
        if(tdt)
            precioFinal += 50;
        return precioFinal; 
    }
}