/*Napíšte program, ktorý načíta dve čísla s desatinnou čiarkou a otestuje, či
        sú rovnaké až na tri desatinné miesta.
        Testovacie údaje
        Zadaj 1. číslo: 25.586
        Zadaj 2. číslo: 25.589
        Očakávaný výstup :
        Sú odlišné

 */

package es.treci;

import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte 1. číslo: ");
        double number1 = scanner.nextDouble();

        System.out.println("Zadajte 2. číslo: ");
        double number2 = scanner.nextDouble();

        // Zaokrúhli na tri desatinné miesta
        double roundedNumber1 = Math.round(number1 * 1000.0) / 1000.0;
        double roundedNumber2 = Math.round(number2 * 1000.0) / 1000.0;

        if (roundedNumber1 == roundedNumber2) {
            System.out.println("Sú rovnaké");
        } else {
            System.out.println("Sú odlišné");
        }

        scanner.close();
    }
}
