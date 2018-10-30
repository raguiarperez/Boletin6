
package boletin6_5;



/**
 *
 * @author rafa
 */
public class numeros {
    
    private int num1;
    private int num2;
    private int num3;

    public numeros(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void numMayor() {
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Número 1 (" + num1 + ") é o maior.");
            } else {
                System.out.println("Número 3 (" + num3 + ") é o maior.");
            }
        } else if (num2 > num3) {
            System.out.println("Número 2 (" + num2 + ") é o maior.");
        } else {
            System.out.println("Número 3 (" + num3 + ") é o maior.");
        }

    }
}
      