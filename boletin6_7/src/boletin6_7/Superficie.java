
package boletin6_7;

import java.util.Scanner;

/**
 *
 * @author raguiarperez
 */
public class Superficie {


    private final float PI = 3.14f;
    private float lado;
    private float base;
    private float altura;
    private float radio;

    public void calcularArea() {
        System.out.println("****MENU****\n 1--> Cuadrado\n 2--> Triangulo\n 3--> Circulo\n\n Elige una de las opciones");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introduce el lado del cuadrado");
                Scanner lad = new Scanner(System.in);
                lado = lad.nextFloat();
                System.out.println("El área del cuadrado es de: " + Math.pow(lado, 2) + "m²");
                break;

            case 2:
                System.out.println("Introduce la base del triángulo:");
                Scanner bas = new Scanner(System.in);
                base = bas.nextFloat();

                System.out.println("Introduce la altura del triángulo:");
                Scanner altu = new Scanner(System.in);
                altura = altu.nextFloat();
                System.out.println("El área del triangulo es de: " + (base * altura) / 2 + "m²");
                break;

            case 3:
                System.out.println("Introduce el radio del círculo: ");
                Scanner rad = new Scanner(System.in);
                radio = rad.nextFloat();
                System.out.println("El área del circulo es de: " + PI * Math.pow(radio, 2));
                break;

            default:
                System.out.println("La opción introducida no es correcta.");
        }
    }
}

