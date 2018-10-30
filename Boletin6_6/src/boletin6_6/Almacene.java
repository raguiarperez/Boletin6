
package boletin6_6;

import javax.swing.JOptionPane;

/**
 *
 * @author rafa
 */
public class Almacene {
    
    private String nombre;
    private int ventas;

    public Almacene(String nome, int vendasA) {
        this.nombre = nome;
        this.ventas = vendasA;
    }

    public void calcularConsumo(Almacene a) {
        if (ventas <= 100) {
            JOptionPane.showMessageDialog(null, a.nombre + " ten un consumo baixo.");
        } else if (ventas <= 500) {
            JOptionPane.showMessageDialog(null, a.nombre + " ten un consumo medio.");
        } else if (ventas <= 1000) {
            JOptionPane.showMessageDialog(null, a.nombre + " ten un consumo alto.");
        } else {
            JOptionPane.showMessageDialog(null, a.nombre + " ten unha primeira necesidade.");
        }
    }
}
