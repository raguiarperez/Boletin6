
package boletin6_4;

/**
 * @author rafa
 */
public class Boletin6_4 {

    public static void main(String[] args) {
        personas persona1 = new personas("Rafa", 90.5);
        personas persona2 = new personas("Maria", 64.2);
        if(persona1.getPeso() > persona2.getPeso()){
            System.out.println(persona1.getNombre() + " pesa más que " + persona2.getNombre());
            System.out.println("La diferencia de peso es de " + (persona1.getPeso() - persona2.getPeso()));
        }
        else{
            System.out.println(persona2.getNombre() + " pesa más que " + persona1.getNombre());
            System.out.println("La diferencia de peso es de " + (persona2.getPeso() - persona1.getPeso()));
        }
    
    }
    
}
