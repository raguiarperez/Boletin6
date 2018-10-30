package boletin6_3;

import java.util.Scanner;

/**
 * @author rafa
 */
public class condicional6_3 {

    public void Numero() {
        Scanner res = new Scanner(System.in);
        System.out.println("teclea numero: ");
        short numero1 = res.nextShort();

        if (numero1 > 0) {
            System.out.println("+");
        } else if (numero1 < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }
        System.out.println("FIN programa");
    }
}
