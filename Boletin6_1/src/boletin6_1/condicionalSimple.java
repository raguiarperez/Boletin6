
package boletin6_1;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class condicionalSimple {

    public void numero(){
        Scanner res =new Scanner(System.in);
        System.out.println("teclea numero :");
        int num =res.nextInt();
        if (num >0){      //si es maior que 0 muestra que es positivo
            System.out.println("é positivo");
        }
      
        System.out.println("Remata o programa");
    }
    
}


