/*Napíšte metódu na nájdenie najmenšieho čísla medzi tromi číslami.
Údaje testu:
Zadajte prvé číslo: 25
Zadajte druhé číslo: 37
Zadajte tretie číslo: 29
Očakávaný výstup:
*/

package es.czwarty;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte prvé číslo: ");
        double a = scanner.nextDouble();

        System.out.println("Zadajte druhé číslo: ");
        double b = scanner.nextDouble();

        System.out.println("Zadajte tretie číslo: ");
        double c = scanner.nextDouble();

        double min = findMinimum(a, b, c);

        System.out.println("Najmenšia hodnota je " + min);

        scanner.close();
    }

    private static double findMinimum(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }
}
