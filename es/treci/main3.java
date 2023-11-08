/*Vezmite od používateľa tri čísla a vypíšte najväčšie číslo.
        Testovacie údaje
        Zadajte 1. číslo: 25
        Zadajte 2. číslo: 78
        Zadajte 3. číslo: 87
        Očakávaný výstup :
        Najväčšie číslo: 87

 */

package es.treci;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte 1. číslo: ");
        double number1 = scanner.nextDouble();

        System.out.println("Zadajte 2. číslo: ");
        double number2 = scanner.nextDouble();

        System.out.println("Zadajte 3. číslo: ");
        double number3 = scanner.nextDouble();

        double max = number1;

        if (number2 > max) {
            max = number2;
        }

        if (number3 > max) {
            max = number3;
        }

        System.out.println("Najväčšie číslo: " + max);

        scanner.close();
    }
}
