
package t_06_ejercicio2_no_evaluable;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: t_06_ejercicio2_no_evaluable
 *
 * Funcion: 
 *          Crearemos una superclase llamada Electrodomestico con las siguientes características:
 *          - Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
 *          - Indica que se podrán heredar.
 *          - Por defecto, el color será blanco, el consumo energético sera F, el precioBase es de
 *            100 € y el peso de 5 kg. Usa constantes para ello.
 *          - Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre
 *            está en mayúsculas o en minúsculas.
 *          Los constructores que se implementarán serán:
 *          - Un constructor por defecto.
 *          - Un constructor con el precio y peso. El resto por defecto.
 *          - Un constructor con todos los atributos. Ten en cuenta que para el atributo consumo
 *            energético, su valor deberá ser una letra entre la A y la F, en caso contrario, su valor
 *            será el consumo energético por defecto. También para el atributo color, deberás
 *            verificar que su valor es válido, sino aplícale el valor del color por defecto.
 *          Los métodos que implementara serán:
 *          - Métodos get y set de todos los atributos.
 *              - En el método set asociado al consumo energético, deberá verificar si la letra
 *                es correcta (es decir entre la A y la F), sino es así, el consumo energético será
 *                el de por defecto.
 *              - Lo mismo ocurre con el método set asociado al color, deberá ser un color
 *                válido, en caso contrario, se le aplicará el color por defecto.
 *          - precioFinal(): Devolverá el precio final del electrodoméstico. Será el precio base más
 *            un plus añadido, este plus viene determinado por el consumo energético y su peso.
 *          
 *          Consumo energético      Plus                    Peso            Plus
 *                  A               100€                Entre 0 y 19 kg     10 €
 *                  B               80€                 Entre 20 y 49 kg    50 €
 *                  C               60€                 Entre 50 y 79 kg    80 €
 *                  D               50€                 Mayor que 80 kg     100 €
 *                  E               30€
 *                  F               10€
 *          Por ejemplo, si el electrodoméstico tiene un precio base de 400€ y su consumo
 *          energético es C y su peso es de 30kg, el precio final será 400 + 60(del consumo
 *          energético, letra C) + 50(peso entre 20 y 49kg), en total 510€.
 *      tiempo actual: 1h 39 min 17 segs + 51.25 = 2H 30Min 42 segs
 */
public class Electrodomestico {
   //DECLARACION DE VARIABLES//
    private static final double PRECIO_BASE_DEFAULT = 100;
    
    private static final String COLOR_DEFAULT = "Blanco";
    private static final String COLOR_1 = "negro";
    private static final String COLOR_2 = "rojo";
    private static final String COLOR_3 = "azul";
    private static final String COLOR_4 = "gris";
    
    private static final char CONSUMO_ENERGETICO_DEFAULT = 'F';
    private static final char CONSUMO_1 = 'A';
    private static final char CONSUMO_2 = 'B';
    private static final char CONSUMO_3 = 'C';
    private static final char CONSUMO_4 = 'D';
    private static final char CONSUMO_5 = 'E';
    
    private static final double PESO_DEFAULT = 5.0;
    
    protected double precioBase = PRECIO_BASE_DEFAULT;
    protected String color = COLOR_DEFAULT;
    protected char consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
    protected double peso = PESO_DEFAULT;
    
   //CONSTRUCTORES//
    public Electrodomestico()
    {
        
    }
    
    public Electrodomestico(double precioBase, double peso)
    {
        this.precioBase = precioBase;
        this.peso = peso;
    }
    
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso)
    {
        this.precioBase = precioBase;
        this.color = compruebaColor(color);
        this.consumoEnergetico = compruebaConsumo(consumoEnergetico);
        this.peso = peso;    

    }

   //GETTERS//
    public static double getPRECIO_BASE_DEFAULT() {
        return PRECIO_BASE_DEFAULT;
    }

    public static char getCONSUMO_ENERGETICO_DEFAULT() {
        return CONSUMO_ENERGETICO_DEFAULT;
    }

    public static String getCOLOR_DEFAULT() {
        return COLOR_DEFAULT;
    }

    public static double getPESO_DEFAULT() {
        return PESO_DEFAULT;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }


    public double getPeso() {
        return peso;
    }
    
   //SETTERS//
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = compruebaColor(color);
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = compruebaConsumo(consumoEnergetico);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
   //METODOS AUXILIARES//
    private String compruebaColor(String color)
    {
        switch(color.toLowerCase())
        {
            case COLOR_1: return color;
            case COLOR_2: return color;
            case COLOR_3: return color;
            case COLOR_4: return color;
            default: return COLOR_DEFAULT;
        }
    }
    
    private char compruebaConsumo(char consumo)
    {
        switch(consumo)
        {
            case CONSUMO_1: return consumo;
            case CONSUMO_2: return consumo;
            case CONSUMO_3: return consumo;
            case CONSUMO_4: return consumo;
            case CONSUMO_5: return consumo;
            default: return CONSUMO_ENERGETICO_DEFAULT;
        }
    }
    
    private int calculaPlusPeso(double precioBase)
    {
        if(peso < 0)
            return 0;
        else if(peso < 20)
            return 10;
        else if(peso < 50)
            return 50;
        else if(peso < 80)
            return 80;
        else
            return 100;
    }
    
    private int calculaPlusConsumo(char consumoEnergetico)
    {
        switch(consumoEnergetico)
        {
            case CONSUMO_1: return 100;
            case CONSUMO_2: return 80;
            case CONSUMO_3: return 60;
            case CONSUMO_4: return 50;
            case CONSUMO_5: return 30;
            default: return CONSUMO_ENERGETICO_DEFAULT;
        }
    }
    
    protected double precioFinal(double precioBase, double peso, char consumoEnergetico)
    {
        int plusPeso = calculaPlusPeso(peso);
        int plusConsumo = calculaPlusConsumo(consumoEnergetico);
        return(precioBase + plusConsumo + plusPeso);
    }
}