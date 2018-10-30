
package boletin6_2;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class condicionalDoble {
        
    public void comparacionNumeros(){
        Scanner res= new Scanner(System.in);
        System.out.println("teclea primer numero: ");
        short numero1= res.nextShort();
        System.out.println("teclea segundo numero: ");
        short numero2= res.nextShort();
        
        if (numero1 >= numero2){
            System.out.println("la resta es "+( numero1-numero2));
        }
        else{
            System.out.println("La suma es "+(numero1+numero2));
        }
        System.out.println("FIN programa");
    }
}


