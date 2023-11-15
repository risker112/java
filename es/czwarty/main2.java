/*Napíšte metódu na výpočet priemeru troch čísel.
Údaje testu:
Zadajte prvé číslo: 25
Zadajte druhé číslo: 45
Zadajte tretie číslo: 65
Očakávaný výstup:
Priemerná hodnota je 45.0
 */

package es.czwarty;


import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Získajte vstup od používateľa
        System.out.print("Zadajte prvé číslo: ");
        double cislo1 = scanner.nextDouble();

        System.out.print("Zadajte druhé číslo: ");
        double cislo2 = scanner.nextDouble();

        System.out.print("Zadajte tretie číslo: ");
        double cislo3 = scanner.nextDouble();

        // Volanie metódy pre priemer
        double priemer = priemerTrochCisiel(cislo1, cislo2, cislo3);

        // Výstup
        System.out.println("Priemerná hodnota je " + priemer);
    }

    // Metóda na výpočet priemeru troch čísel
    public static double priemerTrochCisiel(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
