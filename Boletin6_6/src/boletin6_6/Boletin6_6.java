package boletin6_6;

/**
 *
 * @author rafa
 */
public class Boletin6_6 {

    public static void main(String[] args) {
        Almacene producto1 = new Almacene("Sillas", 85);
        Almacene producto2 = new Almacene("Mesas", 40);
        Almacene producto3 = new Almacene("Armarios", 990);

        producto1.calcularConsumo(producto1);
        producto2.calcularConsumo(producto2);
        producto3.calcularConsumo(producto3);

    
    }

}
