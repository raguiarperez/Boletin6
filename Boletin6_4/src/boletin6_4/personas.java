
package boletin6_4;



/**
 *
 * @author rafa
 */
public class personas {
            
    private String nombre;
    private double peso;
    
    public personas(){}
    public personas(String nombre, double peso){
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    public String getNombre(){
        return nombre;
    }
}
